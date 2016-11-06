//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * Defines an event entry for a team.
 * <p>
 * <p>
 * <p>Classe Java pour TeamEntry complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="TeamEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TeamEntryPerson" type="{http://www.orienteering.org/datastandard/3.0}TeamEntryPerson" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Race" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StartTimeAllocationRequest" type="{http://www.orienteering.org/datastandard/3.0}StartTimeAllocationRequest" minOccurs="0"/>
 *         &lt;element name="ContactInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamEntry", propOrder = {
        "id",
        "name",
        "organisation",
        "teamEntryPerson",
        "clazz",
        "race",
        "assignedFee",
        "serviceRequest",
        "startTimeAllocationRequest",
        "contactInformation",
        "entryTime",
        "extensions"
})
public class TeamEntry
{

    @XmlElement(name = "Id")
    protected Id id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Organisation")
    protected List<Organisation> organisation;
    @XmlElement(name = "TeamEntryPerson")
    protected List<TeamEntryPerson> teamEntryPerson;
    @XmlElement(name = "Class")
    protected List<Class> clazz;
    @XmlElement(name = "Race")
    protected List<BigInteger> race;
    @XmlElement(name = "AssignedFee")
    protected List<AssignedFee> assignedFee;
    @XmlElement(name = "ServiceRequest")
    protected List<ServiceRequest> serviceRequest;
    @XmlElement(name = "StartTimeAllocationRequest")
    protected StartTimeAllocationRequest startTimeAllocationRequest;
    @XmlElement(name = "ContactInformation")
    protected String contactInformation;
    @XmlElement(name = "EntryTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryTime;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
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
     * Obtient la valeur de la propriété name.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName()
    {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value)
    {
        this.name = value;
    }

    /**
     * Gets the value of the organisation property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisation property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisation().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation }
     */
    public List<Organisation> getOrganisation()
    {
        if (organisation == null)
        {
            organisation = new ArrayList<Organisation>();
        }
        return this.organisation;
    }

    /**
     * Gets the value of the teamEntryPerson property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamEntryPerson property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamEntryPerson().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamEntryPerson }
     */
    public List<TeamEntryPerson> getTeamEntryPerson()
    {
        if (teamEntryPerson == null)
        {
            teamEntryPerson = new ArrayList<TeamEntryPerson>();
        }
        return this.teamEntryPerson;
    }

    /**
     * Gets the value of the clazz property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Class }
     */
    public List<Class> getClazz()
    {
        if (clazz == null)
        {
            clazz = new ArrayList<Class>();
        }
        return this.clazz;
    }

    /**
     * Gets the value of the race property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the race property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRace().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     */
    public List<BigInteger> getRace()
    {
        if (race == null)
        {
            race = new ArrayList<BigInteger>();
        }
        return this.race;
    }

    /**
     * Gets the value of the assignedFee property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedFee property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedFee().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignedFee }
     */
    public List<AssignedFee> getAssignedFee()
    {
        if (assignedFee == null)
        {
            assignedFee = new ArrayList<AssignedFee>();
        }
        return this.assignedFee;
    }

    /**
     * Gets the value of the serviceRequest property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRequest property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRequest().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRequest }
     */
    public List<ServiceRequest> getServiceRequest()
    {
        if (serviceRequest == null)
        {
            serviceRequest = new ArrayList<ServiceRequest>();
        }
        return this.serviceRequest;
    }

    /**
     * Obtient la valeur de la propriété startTimeAllocationRequest.
     *
     * @return possible object is
     * {@link StartTimeAllocationRequest }
     */
    public StartTimeAllocationRequest getStartTimeAllocationRequest()
    {
        return startTimeAllocationRequest;
    }

    /**
     * Définit la valeur de la propriété startTimeAllocationRequest.
     *
     * @param value allowed object is
     *              {@link StartTimeAllocationRequest }
     */
    public void setStartTimeAllocationRequest(StartTimeAllocationRequest value)
    {
        this.startTimeAllocationRequest = value;
    }

    /**
     * Obtient la valeur de la propriété contactInformation.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContactInformation()
    {
        return contactInformation;
    }

    /**
     * Définit la valeur de la propriété contactInformation.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContactInformation(String value)
    {
        this.contactInformation = value;
    }

    /**
     * Obtient la valeur de la propriété entryTime.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEntryTime()
    {
        return entryTime;
    }

    /**
     * Définit la valeur de la propriété entryTime.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setEntryTime(XMLGregorianCalendar value)
    {
        this.entryTime = value;
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
