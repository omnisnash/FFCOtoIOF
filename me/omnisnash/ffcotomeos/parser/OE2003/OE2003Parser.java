package me.omnisnash.ffcotomeos.parser.OE2003;

import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import me.omnisnash.ffcotomeos.IConstant;
import me.omnisnash.ffcotomeos.logger.Logger;
import me.omnisnash.ffcotomeos.models.gen.Class;
import me.omnisnash.ffcotomeos.models.gen.*;
import me.omnisnash.ffcotomeos.parser.AParser;

import javax.xml.datatype.DatatypeConfigurationException;
import java.io.*;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import static me.omnisnash.ffcotomeos.IConstant.DEFAULT_COUNTRY;
import static me.omnisnash.ffcotomeos.IConstant.DEFAULT_COUNTRY_CODE;

public class OE2003Parser extends AParser
{
    private Map<String, Organisation> parsedOrganisation;
    private String competitorXmlFilePath;
    private String organisationXmlFilePath;

    public OE2003Parser()
    {
        super();
        parsedOrganisation = new HashMap<>();
    }

    private void parseInputCsv(File inputFile)
    {
        Logger.getInstance().log("Starting 0E2003 CSV parsing.");

        FileInputStream fis = null;

        try
        {

            fis = new FileInputStream(inputFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "ISO8859_1"));

            String line;

            line = br.readLine();
            if (line == null)
            {
                Logger.getInstance().log("File '" + inputFile.getName() + "' isn't a valid CSV ! Aborting.");
                return;
            } else if (!line.equals(IConstant.OE2003_CSV_HEADER))
            {
                Logger.getInstance().log("WARN : the csv header mismatch with the official FFCO OE2003 CSV header");
                Logger.getInstance().log("Generation could fails ! Expected header :");
                Logger.getInstance().log(IConstant.OE2003_CSV_HEADER);
            }

            while ((line = br.readLine()) != null)
            {
                handleCsvLine(line);
            }

            Logger.getInstance().log("Parsing completed.");
            Logger.getInstance().log(organisations.getOrganisation().size() + " organisation(s) parsed.");
            Logger.getInstance().log(competitors.getCompetitor().size() + " competitor(s) parsed.");

            exportToXml(competitorXmlFilePath, organisationXmlFilePath);
        } catch (FileNotFoundException e)
        {
            Logger.getInstance().log("File '" + inputFile.getName() + "' doesn't exist ! Aborting.");
        } catch (IOException e)
        {
            Logger.getInstance().log("Error during CSV parsing. Aborting.");
        } catch (ArrayIndexOutOfBoundsException e)
        {
            Logger.getInstance().log("Invalid CSV line. Aborting.");
        } catch (Exception e)
        {
            Logger.getInstance().log("Unknown error. Exportation fail.");
        } finally
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

    private void handleCsvLine(String line) throws ArrayIndexOutOfBoundsException
    {
        OE2003Item item;

        try
        {
            item = new OE2003Item(line);
        } catch (ArrayIndexOutOfBoundsException e)
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

    private Competitor parseCompetitor(OE2003Item item)
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
        personName.setGiven(item.getCompetitorLastName());
        personName.setFamily(item.getCompetitorFirstName());
        person.setName(personName);

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

    private Organisation parseOrganisation(OE2003Item item)
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
    public void parse(String inputFile, String organisationFile, String competitorsFile)
    {
        competitorXmlFilePath = competitorsFile;
        organisationXmlFilePath = organisationFile;

        File input = new File(inputFile);

        if (!input.isFile())
        {
            Logger.getInstance().log("File '" + input.getName() + "' isn't a file ! Aborting.");
            return;
        }

        parseInputCsv(input);
    }
}
