package me.omnisnash.ffcotomeos;

import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import javafx.scene.Parent;
import javafx.stage.Stage;
import me.omnisnash.ffcotomeos.models.gen.*;
import me.omnisnash.ffcotomeos.models.gen.Class;
import me.omnisnash.ffcotomeos.models.ParsedItem;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.io.*;
import java.util.*;
import java.util.Map;


public class FtmController implements FtmGui.IApplicationInteraction
{
    private static final String COUNTRY_FRANCE = "France";
    private static final String COUNTRY_FRANCE_CODE = "FRA";

    private final FtmGui gui;
    private Map<String, Organisation> parsedOrganisation;
    private OrganisationList organisations;
    private CompetitorList competitors;
    private String organisationXmlFilePath;
    private String competitorXmlFilePath;

    public FtmController(Stage stage)
    {
        parsedOrganisation = new HashMap<>();

        initXmlHeaders();

        gui = new FtmGui(stage, this);
    }

    private void initXmlHeaders()
    {
        organisations = new OrganisationList();
        organisations.setCreator(IConstant.APPLICATION_LINK);
        organisations.setIofVersion(IConstant.IOF_VERSION);
        competitors = new CompetitorList();
    }

    public Parent getGui()
    {
        return gui;
    }


    @Override
    public void onButtonExtract(String input, String organisation, String competitor)
    {
        organisationXmlFilePath = organisation;
        competitorXmlFilePath = competitor;

        gui.clearLogs();

        File inputFile = new File(input);

        if(!inputFile.isFile())
        {
            gui.addLog("File '" + inputFile.getName() + "' isn't a file ! Aborting.");
            return;
        }

        parseInputCsv(inputFile);
    }

    private void parseInputCsv(File inputFile)
    {
        gui.addLog("Starting CSV parsing.");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(inputFile), "UTF8")))
        {
            String line;

            line = br.readLine();
            if(line == null)
            {
                gui.addLog("File '" + inputFile.getName() + "' isn't a valid CSV ! Aborting.");
                return;
            }
            else if(!line.equals(IConstant.FFCO_CSV_HEADER))
            {
                gui.addLog("Warn : the csv header mismatch with the official FFCO CSV header. Generated XML may contain errors (expected header : " + IConstant.FFCO_CSV_HEADER + ")");
            }

            while ((line = br.readLine()) != null)
            {
                handleCsvLine(line);
            }

            gui.addLog("Parsing completed.");
            gui.addLog(organisations.getOrganisation().size() + " organisation(s) parsed.");
            gui.addLog(competitors.getCompetitor().size() + " competitor(s) parsed.");

            exportToXml();
        }
        catch (FileNotFoundException e)
        {
            gui.addLog("File '" + inputFile.getName() + "' doesn't exist ! Aborting.");
        }
        catch (IOException e)
        {
            gui.addLog("Error during CSV parsing. Aborting.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            gui.addLog("Invalid CSV line. Aborting.");
        }
    }

    private void handleCsvLine(String line) throws ArrayIndexOutOfBoundsException
    {
        ParsedItem item;

        try
        {
            item = new ParsedItem(line);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            throw e;
        }

        // ** Organisation
        Organisation organisation;
        if(!parsedOrganisation.containsKey(item.getClubId()))
        {
            organisation = parseOrganisation(item);
            parsedOrganisation.put(item.getClubId(), organisation);
            organisations.getOrganisation().add(organisation);
        }

        // ** Competitor
        Competitor competitor = parseCompetitor(item);
        competitors.getCompetitor().add(competitor);
    }

    private Competitor parseCompetitor(ParsedItem item)
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
        }
        catch (DatatypeConfigurationException e)
        {
            gui.addLog("Error during fetching birth year for competitor n° " + item.getCompetitorId());
        }

        Country country = new Country();
        country.setValue(COUNTRY_FRANCE);
        country.setCode(COUNTRY_FRANCE_CODE);
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

    private Organisation parseOrganisation(ParsedItem item)
    {
        Organisation organisation = new Organisation();
        organisation.setType("Club");
        organisation.setName(item.getClubName() + " " + item.getClubCity());
        
        Country country = new Country();
        country.setCode(COUNTRY_FRANCE_CODE);
        country.setValue(COUNTRY_FRANCE);
        organisation.setCountry(country);

        Id id = new Id();
        id.setValue(item.getClubId());
        organisation.setId(id);

        return organisation;
    }

    private void exportToXml()
    {
        exportCompetitorList();
        exportOrganisationList();
    }

    private void exportCompetitorList()
    {
        gui.addLog("Starting competitors XML export.");
        File file = new File(competitorXmlFilePath);

        try
        {
            competitors.setCreateTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
            JAXBContext jaxbContext = JAXBContext.newInstance(CompetitorList.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(competitors, file);

            gui.addLog("Competitors XML export completed.");
        }
        catch (JAXBException e)
        {
            gui.addLog("Error while competitors XML export :");
            gui.addLog(e.getCause().getMessage());
        } catch (DatatypeConfigurationException e)
        {
            e.printStackTrace();
        }
    }

    private void exportOrganisationList()
    {
        gui.addLog("Starting organisation XML export.");
        File file = new File(organisationXmlFilePath);

        try
        {
            organisations.setCreateTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));

            JAXBContext jaxbContext = JAXBContext.newInstance(OrganisationList.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(organisations, file);

            gui.addLog("Organisation XML export completed.");
        }
        catch (JAXBException e)
        {
            gui.addLog("Error while organisation XML export :");
            gui.addLog(e.getCause().getMessage());
        } catch (DatatypeConfigurationException e)
        {
            e.printStackTrace();
        }
    }
}
