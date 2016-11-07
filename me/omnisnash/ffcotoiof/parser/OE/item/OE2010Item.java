package me.omnisnash.ffcotoiof.parser.OE.item;

public class OE2010Item extends AOEItem
{
    private String competitorAM0009a;
    private String competitorSiEmitted;
    private String competitorGroup;
    private String competitorRegion;
    private String competitorRank;
    private String competitorPoints;
    private String competitorRankings;
    private String competitorText1;
    private String competitorText2;
    private String competitorText3;
    private String competitorAddressLastName;
    private String competitorAddressFirstName;
    private String competitorMobile;


    public OE2010Item(String csvLine) throws ArrayIndexOutOfBoundsException
    {
        super();
        String[] parsedLine = csvLine.split(";");

        try
        {
            int column = -1;
            competitorAM0009a = parsedLine[++column];
            competitorSi = parsedLine[++column];
            competitorSiEmitted = parsedLine[++column];
            competitorId = parsedLine[++column];
            competitorFirstName = parsedLine[++column];
            competitorLastName = parsedLine[++column];
            competitorBirthYear = parsedLine[++column];
            competitorSex = parsedLine[++column];
            clubId = parsedLine[++column];
            clubName = parsedLine[++column];
            clubCity = parsedLine[++column];
            competitorCountry = parsedLine[++column];
            competitorGroup = parsedLine[++column];
            competitorRegion = parsedLine[++column];
            competitorClassId = parsedLine[++column];
            competitorSmallClass = parsedLine[++column];
            competitorLongClass = parsedLine[++column];
            competitorRank = parsedLine[++column];
            competitorPoints = parsedLine[++column];
            competitorRankings = parsedLine[++column];
            competitorNum1 = parsedLine[++column];
            competitorNum2 = parsedLine[++column];
            competitorNum3 = parsedLine[++column];
            competitorText1 = parsedLine[++column];
            competitorText2 = parsedLine[++column];
            competitorText3 = parsedLine[++column];
            competitorAddressLastName = parsedLine[++column];
            competitorAddressFirstName = parsedLine[++column];
            competitorStreet = parsedLine[++column];
            competitorStreetExtra = parsedLine[++column];
            competitorPostalCode = parsedLine[++column];
            competitorCity = parsedLine[++column];
            competitorPhone = parsedLine[++column];
            competitorMobile = parsedLine[++column];
            competitorFax = parsedLine[++column];
            competitorEmail = parsedLine[++column];
            competitorRent = parsedLine[++column];
        } catch (ArrayIndexOutOfBoundsException e)
        {
            throw e;
        }
    }

    public String getCompetitorAM0009a()
    {
        return competitorAM0009a;
    }

    public void setCompetitorAM0009a(String competitorAM0009a)
    {
        this.competitorAM0009a = competitorAM0009a;
    }

    public String getCompetitorSiEmitted()
    {
        return competitorSiEmitted;
    }

    public void setCompetitorSiEmitted(String competitorSiEmitted)
    {
        this.competitorSiEmitted = competitorSiEmitted;
    }

    public String getCompetitorGroup()
    {
        return competitorGroup;
    }

    public void setCompetitorGroup(String competitorGroup)
    {
        this.competitorGroup = competitorGroup;
    }

    public String getCompetitorRegion()
    {
        return competitorRegion;
    }

    public void setCompetitorRegion(String competitorRegion)
    {
        this.competitorRegion = competitorRegion;
    }

    public String getCompetitorRank()
    {
        return competitorRank;
    }

    public void setCompetitorRank(String competitorRank)
    {
        this.competitorRank = competitorRank;
    }

    public String getCompetitorPoints()
    {
        return competitorPoints;
    }

    public void setCompetitorPoints(String competitorPoints)
    {
        this.competitorPoints = competitorPoints;
    }

    public String getCompetitorRankings()
    {
        return competitorRankings;
    }

    public void setCompetitorRankings(String competitorRankings)
    {
        this.competitorRankings = competitorRankings;
    }

    public String getCompetitorText1()
    {
        return competitorText1;
    }

    public void setCompetitorText1(String competitorText1)
    {
        this.competitorText1 = competitorText1;
    }

    public String getCompetitorText2()
    {
        return competitorText2;
    }

    public void setCompetitorText2(String competitorText2)
    {
        this.competitorText2 = competitorText2;
    }

    public String getCompetitorText3()
    {
        return competitorText3;
    }

    public void setCompetitorText3(String competitorText3)
    {
        this.competitorText3 = competitorText3;
    }

    public String getCompetitorAddressLastName()
    {
        return competitorAddressLastName;
    }

    public void setCompetitorAddressLastName(String competitorAddressLastName)
    {
        this.competitorAddressLastName = competitorAddressLastName;
    }

    public String getCompetitorAddressFirstName()
    {
        return competitorAddressFirstName;
    }

    public void setCompetitorAddressFirstName(String competitorAddressFirstName)
    {
        this.competitorAddressFirstName = competitorAddressFirstName;
    }

    public String getCompetitorMobile()
    {
        return competitorMobile;
    }

    public void setCompetitorMobile(String competitorMobile)
    {
        this.competitorMobile = competitorMobile;
    }
}
