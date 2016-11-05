package me.omnisnash.ffcotomeos;

import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.stage.Stage;
import me.omnisnash.ffcotomeos.models.*;
import me.omnisnash.ffcotomeos.models.Class;

import javax.xml.datatype.DatatypeConfigurationException;
import java.io.*;
import java.util.*;


public class FtmController implements FtmGui.IApplicationInteraction
{
    private final FtmGui gui;
    private boolean validCsv;
    private List<String> parsedOrganisation;
    private OrganisationList organisations;
    private CompetitorList competitors;

    public FtmController(Stage stage)
    {
        validCsv = false;
        parsedOrganisation = new ArrayList<>();
        gui = new FtmGui(stage, this);
    }

    public Parent getGui()
    {
        return gui;
    }


    @Override
    public void onButtonExtract(String input, String organisation, String competitor)
    {
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
        validCsv = false;

        gui.addLog("Starting CSV parsing");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile)))
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
        }
        catch (FileNotFoundException e)
        {
            gui.addLog("File '" + inputFile.getName() + "' doesn't exist ! Aborting.");
        }
        catch (IOException e)
        {
            gui.addLog("Error during CSV parsing. Aborting");
        }
    }

    private void handleCsvLine(String line)
    {
        String[] parsedLine = line.split(";");

        // Todo : parse Organisation + MAp <name, Orga>;
        // Todo : Competitor : class + org

        Competitor competitor = new Competitor();

        // SI
        ControlCard controlCard = new ControlCard();
        controlCard.setPunchingSystem(IConstant.DEFAULT_PUNCHING_SYSTEM);
        controlCard.setValue(parsedLine[1]);
        competitor.getControlCard().add(controlCard);

        // Identity
        Person person = new Person();

        Id id = new Id();
        id.setValue(parsedLine[0]);
        person.getId().add(id);

        PersonName personName = new PersonName();
        personName.setGiven(parsedLine[2]);
        personName.setFamily(parsedLine[3]);
        person.setName(personName);

        try
        {
            person.setBirthDate(DatatypeFactoryImpl.newInstance().newXMLGregorianCalendar(new GregorianCalendar(Integer.parseInt(parsedLine[4]), 01, 01)));
        }
        catch (DatatypeConfigurationException e)
        {
            e.printStackTrace();
        }

        Country country = new Country();
        country.setValue("France");
        country.setCode("FRA");
        person.setNationality(country);
    }
}
