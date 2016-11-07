package me.omnisnash.ffcotomeos.parser;

import me.omnisnash.ffcotomeos.IConstant;
import me.omnisnash.ffcotomeos.logger.Logger;
import me.omnisnash.ffcotomeos.models.gen.CompetitorList;
import me.omnisnash.ffcotomeos.models.gen.OrganisationList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.io.File;
import java.util.GregorianCalendar;

public abstract class AParser
{
    protected OrganisationList organisations;
    protected CompetitorList competitors;
    protected boolean invertName;

    public AParser()
    {
        invertName = false;
        initXmlHeaders();
    }

    protected abstract void parse(ExtractRequest request);

    private void initXmlHeaders()
    {
        organisations = new OrganisationList();
        organisations.setCreator(IConstant.APPLICATION_LINK);
        organisations.setIofVersion(IConstant.IOF_VERSION);

        competitors = new CompetitorList();
        competitors.setCreator(IConstant.APPLICATION_LINK);
        competitors.setIofVersion(IConstant.IOF_VERSION);
    }

    protected void exportToXml(String competitorXmlFilePath, String organisationXmlFilePat)
    {
        exportCompetitorList(competitorXmlFilePath);
        exportOrganisationList(organisationXmlFilePat);
    }

    private void exportCompetitorList(String competitorXmlFilePath)
    {
        Logger.getInstance().log("Starting competitors XML export.");
        File file = new File(competitorXmlFilePath);

        try
        {
            competitors.setCreateTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
            JAXBContext jaxbContext = JAXBContext.newInstance(CompetitorList.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(competitors, file);

            Logger.getInstance().log("Competitors XML export completed.");
        } catch (JAXBException e)
        {
            Logger.getInstance().log("Error while competitors XML export :");
            Logger.getInstance().log(e.getCause().getMessage());
        } catch (DatatypeConfigurationException e)
        {
            e.printStackTrace();
        }
    }

    private void exportOrganisationList(String organisationXmlFilePath)
    {
        Logger.getInstance().log("Starting organisation XML export.");
        File file = new File(organisationXmlFilePath);

        try
        {
            organisations.setCreateTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));

            JAXBContext jaxbContext = JAXBContext.newInstance(OrganisationList.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(organisations, file);

            Logger.getInstance().log("Organisation XML export completed.");
        } catch (JAXBException e)
        {
            Logger.getInstance().log("Error while organisation XML export :");
            Logger.getInstance().log(e.getCause().getMessage());
        } catch (DatatypeConfigurationException e)
        {
            e.printStackTrace();
        }
    }


}
