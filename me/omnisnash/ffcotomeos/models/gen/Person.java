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
 * Represents a person. This could either be a competitor (see the Competitor element) or contact persons in an organisation (see the Organisation element).
 * <p>
 * <p>
 * <p>Classe Java pour Person complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.orienteering.org/datastandard/3.0}PersonName"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.orienteering.org/datastandard/3.0}Country" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.orienteering.org/datastandard/3.0}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://www.orienteering.org/datastandard/3.0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sex">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="F"/>
 *             &lt;enumeration value="M"/>
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
@XmlType(name = "Person", propOrder = {
        "id",
        "name",
        "birthDate",
        "nationality",
        "address",
        "contact",
        "extensions"
})
public class Person
{

    @XmlElement(name = "Id")
    protected List<Id> id;
    @XmlElement(name = "Name", required = true)
    protected PersonName name;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "Nationality")
    protected Country nationality;
    @XmlElement(name = "Address")
    protected List<Address> address;
    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "sex")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sex;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Gets the value of the id property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Id }
     */
    public List<Id> getId()
    {
        if (id == null)
        {
            id = new ArrayList<Id>();
        }
        return this.id;
    }

    /**
     * Obtient la valeur de la propriété name.
     *
     * @return possible object is
     * {@link PersonName }
     */
    public PersonName getName()
    {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     *
     * @param value allowed object is
     *              {@link PersonName }
     */
    public void setName(PersonName value)
    {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété birthDate.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getBirthDate()
    {
        return birthDate;
    }

    /**
     * Définit la valeur de la propriété birthDate.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setBirthDate(XMLGregorianCalendar value)
    {
        this.birthDate = value;
    }

    /**
     * Obtient la valeur de la propriété nationality.
     *
     * @return possible object is
     * {@link Country }
     */
    public Country getNationality()
    {
        return nationality;
    }

    /**
     * Définit la valeur de la propriété nationality.
     *
     * @param value allowed object is
     *              {@link Country }
     */
    public void setNationality(Country value)
    {
        this.nationality = value;
    }

    /**
     * Gets the value of the address property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     */
    public List<Address> getAddress()
    {
        if (address == null)
        {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the contact property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     */
    public List<Contact> getContact()
    {
        if (contact == null)
        {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
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
     * Obtient la valeur de la propriété sex.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSex()
    {
        return sex;
    }

    /**
     * Définit la valeur de la propriété sex.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSex(String value)
    {
        this.sex = value;
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
