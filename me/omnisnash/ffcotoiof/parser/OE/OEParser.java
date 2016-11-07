package me.omnisnash.ffcotoiof.parser.OE;

import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import me.omnisnash.ffcotoiof.IConstant;
import me.omnisnash.ffcotoiof.logger.Logger;
import me.omnisnash.ffcotoiof.models.gen.*;
import me.omnisnash.ffcotoiof.models.gen.Class;
import me.omnisnash.ffcotoiof.parser.AParser;
import me.omnisnash.ffcotoiof.parser.ExtractRequest;
import me.omnisnash.ffcotoiof.parser.OE.item.AOEItem;
import me.omnisnash.ffcotoiof.parser.OE.item.OE2003Item;
import me.omnisnash.ffcotoiof.parser.OE.item.OE2010Item;

import javax.xml.datatype.DatatypeConfigurationException;
import java.io.*;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import static me.omnisnash.ffcotoiof.IConstant.DEFAULT_COUNTRY;
import static me.omnisnash.ffcotoiof.IConstant.DEFAULT_COUNTRY_CODE;

public class OEParser extends AParser
{
    private Map<String, Organisation> parsedOrganisation;
    private String competitorXmlFilePath;
    private String organisationXmlFilePath;
    private ExtractRequest request;

    public OEParser()
    {
        super();
        parsedOrganisation = new HashMap<>();
    }

    private void parseInputtedCsvFile(File inputtedFile)
    {
        Logger.getInstance().log("Starting " + request.getFormat().toString() + " CSV parsing.");

        FileInputStream fis = null;

        try
        {

            fis = new FileInputStream(inputtedFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, IConstant.OE_FILE_ENCODING));

            // CSV header checking
            String line = br.readLine();
            if (line == null)
            {
                Logger.getInstance().log("File '" + inputtedFile.getName() + "' isn't a valid CSV ! Aborting.");
                return;
            }

            String header = "";
            switch (request.getFormat())
            {
                case OE2003:
                    header =IConstant.OE2003_CSV_HEADER;
                    break;
                case OE2010:
                    header =IConstant.OE2010_CSV_HEADER;
                    break;
            }

            if(!line.equals(header))
            {
                Logger.getInstance().log("WARN : the csv header mismatch with the official FFCO " + request.getFormat().toString() + " CSV header");
                Logger.getInstance().log("Generation could fails ! Expected header :");
                Logger.getInstance().log(header);
            }


            while ((line = br.readLine()) != null)
            {
                handleOEItem(line);
            }

            Logger.getInstance().log("Parsing completed.");
            Logger.getInstance().log(organisations.getOrganisation().size() + " organisation(s) parsed.");
            Logger.getInstance().log(competitors.getCompetitor().size() + " competitor(s) parsed.");

            exportToXml(competitorXmlFilePath, organisationXmlFilePath);
        }
        catch (FileNotFoundException e)
        {
            Logger.getInstance().log("File '" + inputtedFile.getName() + "' doesn't exist ! Aborting.");
        }
        catch (IOException e)
        {
            Logger.getInstance().log("Error during CSV parsing. Aborting.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            Logger.getInstance().log("Invalid CSV line. Aborting.");
        }
        catch (Exception e)
        {
            Logger.getInstance().log("Unknown error. Exportation fail.");
        }
        finally
        {
            if (fis != null)
            {
                try
                {
                    fis.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    private void handleOEItem(String line) throws ArrayIndexOutOfBoundsException
    {
        AOEItem item = null;

        try
        {
            switch (request.getFormat())
            {
                case OE2003:
                    item = new OE2003Item(line);
                    break;
                case OE2010:
                    item = new OE2010Item(line);
                    break;
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            throw e;
        }

        // ** Organisation
        Organisation organisation;
        if (!parsedOrganisation.containsKey(item.getClubId()))
        {
            organisation = parseOrganisation(item);
            parsedOrganisation.put(item.getClubId(), organisation);
            organisations.getOrganisation().add(organisation);
        }

        // ** Competitor
        Competitor competitor = parseCompetitor(item);
        competitors.getCompetitor().add(competitor);
    }

    private Competitor parseCompetitor(AOEItem item)
    {
        Competitor competitor = new Competitor();

        // Organisation
        competitor.getOrganisation().add(parsedOrganisation.get(item.getClubId()));

        // SI
        ControlCard controlCard = new ControlCard();
        competitor.getControlCard().add(controlCard);
        controlCard.setPunchingSystem(IConstant.DEFAULT_PUNCHING_SYSTEM);
        controlCard.setValue(item.getCompetitorSi());

        // Identity
        Person person = new Person();
        competitor.setPerson(person);

        Id idPerson = new Id();
        idPerson.setValue(item.getCompetitorId());
        person.getId().add(idPerson);

        PersonName personName = new PersonName();
        personName.setGiven(invertName ? item.getCompetitorFirstName() : item.getCompetitorLastName());
        personName.setFamily(invertName ? item.getCompetitorLastName() : item.getCompetitorFirstName());
        person.setName(personName);
        person.setSex(item.getCompetitorSex());

        try
        {
            person.setBirthDate(DatatypeFactoryImpl.newInstance().newXMLGregorianCalendar(new GregorianCalendar(Integer.parseInt(item.getCompetitorBirthYear()), 01, 01)));
        } catch (DatatypeConfigurationException e)
        {
            Logger.getInstance().log("Error during fetching birth year for competitor n° " + item.getCompetitorId());
        }

        Country country = new Country();
        country.setValue(DEFAULT_COUNTRY);
        country.setCode(DEFAULT_COUNTRY_CODE);
        person.setNationality(country);

        // Class
        Class clazz = new Class();
        competitor.getClazz().add(clazz);
        clazz.setName(item.getCompetitorSmallClass());

        Id idClass = new Id();
        idClass.setValue(item.getCompetitorSmallClass());
        clazz.setId(idClass);

        return competitor;
    }

    private Organisation parseOrganisation(AOEItem item)
    {
        Organisation organisation = new Organisation();
        organisation.setType("Club");
        organisation.setName(item.getClubName() + " " + item.getClubCity());

        Country country = new Country();
        country.setCode(DEFAULT_COUNTRY_CODE);
        country.setValue(DEFAULT_COUNTRY);
        organisation.setCountry(country);

        Id id = new Id();
        id.setValue(item.getClubId());
        organisation.setId(id);

        return organisation;
    }


    @Override
    public void parse(ExtractRequest extractRequest)
    {
        request = extractRequest;

        if(request == null)
        {
            Logger.getInstance().log("Invalid extraction request ! Aborting.");
            return;
        }

        parsedOrganisation.clear();

        competitorXmlFilePath = request.getCompetitorsXmlPath();
        organisationXmlFilePath = request.getOrganisationsXmlPath();
        invertName = request.isInvertName();

        File input = new File(request.getInputtedFilePath());

        if (!input.exists())
        {
            Logger.getInstance().log("File '" + input.getName() + "' doesn't exist ! Aborting.");
            return;
        }

        if (!input.isFile())
        {
            Logger.getInstance().log("File '" + input.getName() + "' isn't a file ! Aborting.");
            return;
        }

        parseInputtedCsvFile(input);
    }
}
