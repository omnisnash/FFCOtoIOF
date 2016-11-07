package me.omnisnash.ffcotoiof.parser;

public class ExtractRequest
{
    private ESupportedFormat format;

    private String inputtedFilePath;
    private String organisationsXmlPath;
    private String competitorsXmlPath;

    private boolean invertName;

    public ExtractRequest(ESupportedFormat inputFormat)
    {
        format = inputFormat;
        invertName = false;
    }

    public ESupportedFormat getFormat()
    {
        return format;
    }

    public void setFormat(ESupportedFormat format)
    {
        this.format = format;
    }

    public String getInputtedFilePath()
    {
        return inputtedFilePath;
    }

    public void setInputtedFilePath(String inputtedFilePath)
    {
        this.inputtedFilePath = inputtedFilePath;
    }

    public String getOrganisationsXmlPath()
    {
        return organisationsXmlPath;
    }

    public void setOrganisationsXmlPath(String organisationsXmlPath)
    {
        this.organisationsXmlPath = organisationsXmlPath;
    }

    public String getCompetitorsXmlPath()
    {
        return competitorsXmlPath;
    }

    public void setCompetitorsXmlPath(String competitorsXmlPath)
    {
        this.competitorsXmlPath = competitorsXmlPath;
    }

    public boolean isInvertName()
    {
        return invertName;
    }

    public void setInvertName(boolean invertName)
    {
        this.invertName = invertName;
    }
}
