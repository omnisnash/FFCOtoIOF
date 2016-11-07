//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * Result information for a team member, including e.g. result status, place, finish time, and split times.
 * <p>
 * <p>
 * <p>Classe Java pour TeamMemberResult complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="TeamMemberResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntryId" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         &lt;element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person" minOccurs="0"/>
 *         &lt;element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.orienteering.org/datastandard/3.0}TeamMemberRaceResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamMemberResult", propOrder = {
        "entryId",
        "person",
        "organisation",
        "result",
        "extensions"
})
public class TeamMemberResult
{

    @XmlElement(name = "EntryId")
    protected Id entryId;
    @XmlElement(name = "Person")
    protected Person person;
    @XmlElement(name = "Organisation")
    protected Organisation organisation;
    @XmlElement(name = "Result")
    protected List<TeamMemberRaceResult> result;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Obtient la valeur de la propriété entryId.
     *
     * @return possible object is
     * {@link Id }
     */
    public Id getEntryId()
    {
        return entryId;
    }

    /**
     * Définit la valeur de la propriété entryId.
     *
     * @param value allowed object is
     *              {@link Id }
     */
    public void setEntryId(Id value)
    {
        this.entryId = value;
    }

    /**
     * Obtient la valeur de la propriété person.
     *
     * @return possible object is
     * {@link Person }
     */
    public Person getPerson()
    {
        return person;
    }

    /**
     * Définit la valeur de la propriété person.
     *
     * @param value allowed object is
     *              {@link Person }
     */
    public void setPerson(Person value)
    {
        this.person = value;
    }

    /**
     * Obtient la valeur de la propriété organisation.
     *
     * @return possible object is
     * {@link Organisation }
     */
    public Organisation getOrganisation()
    {
        return organisation;
    }

    /**
     * Définit la valeur de la propriété organisation.
     *
     * @param value allowed object is
     *              {@link Organisation }
     */
    public void setOrganisation(Organisation value)
    {
        this.organisation = value;
    }

    /**
     * Gets the value of the result property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberRaceResult }
     */
    public List<TeamMemberRaceResult> getResult()
    {
        if (result == null)
        {
            result = new ArrayList<TeamMemberRaceResult>();
        }
        return this.result;
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