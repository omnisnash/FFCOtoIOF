package me.omnisnash.ffcotomeos.parser.OE2003;

public class OE2003Item
{
    private String competitorId;
    private String competitorSi;
    private String competitorFirstName;
    private String competitorLastName;
    private String competitorBirthYear;
    private String competitorSex;
    private String clubId;
    private String clubName;
    private String clubCity;
    private String competitorCountry;
    private String competitorClassId;
    private String competitorSmallClass;
    private String competitorLongClass;
    private String competitorNum1;
    private String competitorNum2;
    private String competitorNum3;
    private String competitorEmail;
    private String competitorText1;
    private String competitorText2;
    private String competitorText3;
    private String competitorAddressName;
    private String competitorStreet;
    private String competitorStreetExtra;
    private String competitorPostalCode;
    private String competitorCity;
    private String competitorPhone;
    private String competitorFax;
    private String competitorSecondMail;
    private String competitorClubId;
    private String competitorRent;

    public OE2003Item(String csvLine) throws ArrayIndexOutOfBoundsException
    {
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

    public String getCompetitorId()
    {
        return competitorId;
    }

    public void setCompetitorId(String competitorId)
    {
        this.competitorId = competitorId;
    }

    public String getCompetitorSi()
    {
        return competitorSi;
    }

    public void setCompetitorSi(String competitorSi)
    {
        this.competitorSi = competitorSi;
    }

    public String getCompetitorFirstName()
    {
        return competitorFirstName;
    }

    public void setCompetitorFirstName(String competitorFirstName)
    {
        this.competitorFirstName = competitorFirstName;
    }

    public String getCompetitorLastName()
    {
        return competitorLastName;
    }

    public void setCompetitorLastName(String competitorLastName)
    {
        this.competitorLastName = competitorLastName;
    }

    public String getCompetitorBirthYear()
    {
        return competitorBirthYear;
    }

    public void setCompetitorBirthYear(String competitorBirthYear)
    {
        this.competitorBirthYear = competitorBirthYear;
    }

    public String getCompetitorSex()
    {
        return competitorSex;
    }

    public void setCompetitorSex(String competitorSex)
    {
        this.competitorSex = competitorSex;
    }

    public String getClubId()
    {
        return clubId;
    }

    public void setClubId(String clubId)
    {
        this.clubId = clubId;
    }

    public String getClubName()
    {
        return clubName;
    }

    public void setClubName(String clubName)
    {
        this.clubName = clubName;
    }

    public String getClubCity()
    {
        return clubCity;
    }

    public void setClubCity(String clubCity)
    {
        this.clubCity = clubCity;
    }

    public String getCompetitorCountry()
    {
        return competitorCountry;
    }

    public void setCompetitorCountry(String competitorCountry)
    {
        this.competitorCountry = competitorCountry;
    }

    public String getCompetitorClassId()
    {
        return competitorClassId;
    }

    public void setCompetitorClassId(String competitorClassId)
    {
        this.competitorClassId = competitorClassId;
    }

    public String getCompetitorSmallClass()
    {
        return competitorSmallClass;
    }

    public void setCompetitorSmallClass(String competitorSmallClass)
    {
        this.competitorSmallClass = competitorSmallClass;
    }

    public String getCompetitorLongClass()
    {
        return competitorLongClass;
    }

    public void setCompetitorLongClass(String competitorLongClass)
    {
        this.competitorLongClass = competitorLongClass;
    }

    public String getCompetitorNum1()
    {
        return competitorNum1;
    }

    public void setCompetitorNum1(String competitorNum1)
    {
        this.competitorNum1 = competitorNum1;
    }

    public String getCompetitorNum2()
    {
        return competitorNum2;
    }

    public void setCompetitorNum2(String competitorNum2)
    {
        this.competitorNum2 = competitorNum2;
    }

    public String getCompetitorNum3()
    {
        return competitorNum3;
    }

    public void setCompetitorNum3(String competitorNum3)
    {
        this.competitorNum3 = competitorNum3;
    }

    public String getCompetitorEmail()
    {
        return competitorEmail;
    }

    public void setCompetitorEmail(String competitorEmail)
    {
        this.competitorEmail = competitorEmail;
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

    public String getCompetitorStreet()
    {
        return competitorStreet;
    }

    public void setCompetitorStreet(String competitorStreet)
    {
        this.competitorStreet = competitorStreet;
    }

    public String getCompetitorStreetExtra()
    {
        return competitorStreetExtra;
    }

    public void setCompetitorStreetExtra(String competitorStreetExtra)
    {
        this.competitorStreetExtra = competitorStreetExtra;
    }

    public String getCompetitorPostalCode()
    {
        return competitorPostalCode;
    }

    public void setCompetitorPostalCode(String competitorPostalCode)
    {
        this.competitorPostalCode = competitorPostalCode;
    }

    public String getCompetitorCity()
    {
        return competitorCity;
    }

    public void setCompetitorCity(String competitorCity)
    {
        this.competitorCity = competitorCity;
    }

    public String getCompetitorPhone()
    {
        return competitorPhone;
    }

    public void setCompetitorPhone(String competitorPhone)
    {
        this.competitorPhone = competitorPhone;
    }

    public String getCompetitorFax()
    {
        return competitorFax;
    }

    public void setCompetitorFax(String competitorFax)
    {
        this.competitorFax = competitorFax;
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

    public String getCompetitorRent()
    {
        return competitorRent;
    }

    public void setCompetitorRent(String competitorRent)
    {
        this.competitorRent = competitorRent;
    }
}
