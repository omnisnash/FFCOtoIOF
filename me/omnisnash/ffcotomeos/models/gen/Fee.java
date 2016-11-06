//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * A fee that applies when entering a class at a race or ordering a service.
 * <p>
 * <p>
 * <p>Classe Java pour Fee complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="Fee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.orienteering.org/datastandard/3.0}LanguageString" maxOccurs="unbounded"/>
 *         &lt;element name="Amount" type="{http://www.orienteering.org/datastandard/3.0}Amount" minOccurs="0"/>
 *         &lt;element name="TaxableAmount" type="{http://www.orienteering.org/datastandard/3.0}Amount" minOccurs="0"/>
 *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaxablePercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ValidFromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidToTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FromDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ToDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" default="Normal">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Normal"/>
 *             &lt;enumeration value="Late"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee", propOrder = {
        "id",
        "name",
        "amount",
        "taxableAmount",
        "percentage",
        "taxablePercentage",
        "validFromTime",
        "validToTime",
        "fromDateOfBirth",
        "toDateOfBirth",
        "extensions"
})
public class Fee
{

    @XmlElement(name = "Id")
    protected Id id;
    @XmlElement(name = "Name", required = true)
    protected List<LanguageString> name;
    @XmlElement(name = "Amount")
    protected Amount amount;
    @XmlElement(name = "TaxableAmount")
    protected Amount taxableAmount;
    @XmlElement(name = "Percentage")
    protected Double percentage;
    @XmlElement(name = "TaxablePercentage")
    protected Double taxablePercentage;
    @XmlElement(name = "ValidFromTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFromTime;
    @XmlElement(name = "ValidToTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validToTime;
    @XmlElement(name = "FromDateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDateOfBirth;
    @XmlElement(name = "ToDateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDateOfBirth;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Obtient la valeur de la propriété id.
     *
     * @return possible object is
     * {@link Id }
     */
    public Id getId()
    {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     *
     * @param value allowed object is
     *              {@link Id }
     */
    public void setId(Id value)
    {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageString }
     */
    public List<LanguageString> getName()
    {
        if (name == null)
        {
            name = new ArrayList<LanguageString>();
        }
        return this.name;
    }

    /**
     * Obtient la valeur de la propriété amount.
     *
     * @return possible object is
     * {@link Amount }
     */
    public Amount getAmount()
    {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     *
     * @param value allowed object is
     *              {@link Amount }
     */
    public void setAmount(Amount value)
    {
        this.amount = value;
    }

    /**
     * Obtient la valeur de la propriété taxableAmount.
     *
     * @return possible object is
     * {@link Amount }
     */
    public Amount getTaxableAmount()
    {
        return taxableAmount;
    }

    /**
     * Définit la valeur de la propriété taxableAmount.
     *
     * @param value allowed object is
     *              {@link Amount }
     */
    public void setTaxableAmount(Amount value)
    {
        this.taxableAmount = value;
    }

    /**
     * Obtient la valeur de la propriété percentage.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getPercentage()
    {
        return percentage;
    }

    /**
     * Définit la valeur de la propriété percentage.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setPercentage(Double value)
    {
        this.percentage = value;
    }

    /**
     * Obtient la valeur de la propriété taxablePercentage.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTaxablePercentage()
    {
        return taxablePercentage;
    }

    /**
     * Définit la valeur de la propriété taxablePercentage.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setTaxablePercentage(Double value)
    {
        this.taxablePercentage = value;
    }

    /**
     * Obtient la valeur de la propriété validFromTime.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getValidFromTime()
    {
        return validFromTime;
    }

    /**
     * Définit la valeur de la propriété validFromTime.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setValidFromTime(XMLGregorianCalendar value)
    {
        this.validFromTime = value;
    }

    /**
     * Obtient la valeur de la propriété validToTime.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getValidToTime()
    {
        return validToTime;
    }

    /**
     * Définit la valeur de la propriété validToTime.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setValidToTime(XMLGregorianCalendar value)
    {
        this.validToTime = value;
    }

    /**
     * Obtient la valeur de la propriété fromDateOfBirth.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFromDateOfBirth()
    {
        return fromDateOfBirth;
    }

    /**
     * Définit la valeur de la propriété fromDateOfBirth.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFromDateOfBirth(XMLGregorianCalendar value)
    {
        this.fromDateOfBirth = value;
    }

    /**
     * Obtient la valeur de la propriété toDateOfBirth.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getToDateOfBirth()
    {
        return toDateOfBirth;
    }

    /**
     * Définit la valeur de la propriété toDateOfBirth.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setToDateOfBirth(XMLGregorianCalendar value)
    {
        this.toDateOfBirth = value;
    }

    /**
     * Obtient la valeur de la propriété extensions.
     *
     * @return possible object is
     * {@link Extensions }
     */
    public Extensions getExtensions()
    {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     *
     * @param value allowed object is
     *              {@link Extensions }
     */
    public void setExtensions(Extensions value)
    {
        this.extensions = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType()
    {
        if (type == null)
        {
            return "Normal";
        } else
        {
            return type;
        }
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
