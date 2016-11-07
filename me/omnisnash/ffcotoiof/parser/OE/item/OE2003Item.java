package me.omnisnash.ffcotoiof.parser.OE.item;

public class OE2003Item extends AOEItem
{
    private String competitorText1;
    private String competitorText2;
    private String competitorText3;
    private String competitorAddressName;
    private String competitorSecondMail;
    private String competitorClubId;

    public OE2003Item(String csvLine) throws ArrayIndexOutOfBoundsException
    {
        super();
        String[] parsedLine = csvLine.split(";");

        try
        {
            int column = -1;
            competitorId = parsedLine[++column];
            competitorSi = parsedLine[++column];
            competitorFirstName = parsedLine[++column];
            competitorLastName = parsedLine[++column];
            competitorBirthYear = parsedLine[++column];
            competitorSex = parsedLine[++column];
            clubId = parsedLine[++column];
            clubName = parsedLine[++column];
            clubCity = parsedLine[++column];
            competitorCountry = parsedLine[++column];
            competitorClassId = parsedLine[++column];
            competitorSmallClass = parsedLine[++column];
            competitorLongClass = parsedLine[++column];
            competitorNum1 = parsedLine[++column];
            competitorNum2 = parsedLine[++column];
            competitorNum3 = parsedLine[++column];
            competitorEmail = parsedLine[++column];
            competitorText1 = parsedLine[++column];
            competitorText2 = parsedLine[++column];
            competitorText3 = parsedLine[++column];
            competitorAddressName = parsedLine[++column];
            competitorStreet = parsedLine[++column];
            competitorStreetExtra = parsedLine[++column];
            competitorPostalCode = parsedLine[++column];
            competitorCity = parsedLine[++column];
            competitorPhone = parsedLine[++column];
            competitorFax = parsedLine[++column];
            competitorSecondMail = parsedLine[++column];
            competitorClubId = parsedLine[++column];
            competitorRent = parsedLine[++column];
        } catch (ArrayIndexOutOfBoundsException e)
        {
            throw e;
        }
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

    public String getCompetitorAddressName()
    {
        return competitorAddressName;
    }

    public void setCompetitorAddressName(String competitorAddressName)
    {
        this.competitorAddressName = competitorAddressName;
    }

    public String getCompetitorSecondMail()
    {
        return competitorSecondMail;
    }

    public void setCompetitorSecondMail(String competitorSecondMail)
    {
        this.competitorSecondMail = competitorSecondMail;
    }

    public String getCompetitorClubId()
    {
        return competitorClubId;
    }

    public void setCompetitorClubId(String competitorClubId)
    {
        this.competitorClubId = competitorClubId;
    }
}
