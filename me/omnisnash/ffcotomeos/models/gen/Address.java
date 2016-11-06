//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The postal address of a person or organisation.
 * <p>
 * <p>
 * <p>Classe Java pour Address complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CareOf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.orienteering.org/datastandard/3.0}Country" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
        "careOf",
        "street",
        "zipCode",
        "city",
        "state",
        "country"
})
public class Address
{

    @XmlElement(name = "CareOf")
    protected String careOf;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Country")
    protected Country country;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Obtient la valeur de la propriété careOf.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCareOf()
    {
        return careOf;
    }

    /**
     * Définit la valeur de la propriété careOf.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCareOf(String value)
    {
        this.careOf = value;
    }

    /**
     * Obtient la valeur de la propriété street.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStreet()
    {
        return street;
    }

    /**
     * Définit la valeur de la propriété street.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreet(String value)
    {
        this.street = value;
    }

    /**
     * Obtient la valeur de la propriété zipCode.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZipCode()
    {
        return zipCode;
    }

    /**
     * Définit la valeur de la propriété zipCode.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setZipCode(String value)
    {
        this.zipCode = value;
    }

    /**
     * Obtient la valeur de la propriété city.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Définit la valeur de la propriété city.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCity(String value)
    {
        this.city = value;
    }

    /**
     * Obtient la valeur de la propriété state.
     *
     * @return possible object is
     * {@link String }
     */
    public String getState()
    {
        return state;
    }

    /**
     * Définit la valeur de la propriété state.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setState(String value)
    {
        this.state = value;
    }

    /**
     * Obtient la valeur de la propriété country.
     *
     * @return possible object is
     * {@link Country }
     */
    public Country getCountry()
    {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     *
     * @param value allowed object is
     *              {@link Country }
     */
    public void setCountry(Country value)
    {
        this.country = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType()
    {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value)
    {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété modifyTime.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getModifyTime()
    {
        return modifyTime;
    }

    /**
     * Définit la valeur de la propriété modifyTime.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setModifyTime(XMLGregorianCalendar value)
    {
        this.modifyTime = value;
    }

}
