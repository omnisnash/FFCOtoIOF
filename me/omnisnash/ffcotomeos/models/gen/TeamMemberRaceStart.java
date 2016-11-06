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
 * Start information for a team member in a race.
 * <p>
 * <p>
 * <p>Classe Java pour TeamMemberRaceStart complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="TeamMemberRaceStart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Leg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleCourse" minOccurs="0"/>
 *         &lt;element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamMemberRaceStart", propOrder = {
        "leg",
        "legOrder",
        "bibNumber",
        "startTime",
        "course",
        "controlCard",
        "assignedFee",
        "serviceRequest",
        "extensions"
})
public class TeamMemberRaceStart
{

    @XmlElement(name = "Leg")
    protected BigInteger leg;
    @XmlElement(name = "LegOrder")
    protected BigInteger legOrder;
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "Course")
    protected SimpleCourse course;
    @XmlElement(name = "ControlCard")
    protected List<ControlCard> controlCard;
    @XmlElement(name = "AssignedFee")
    protected List<AssignedFee> assignedFee;
    @XmlElement(name = "ServiceRequest")
    protected List<ServiceRequest> serviceRequest;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "raceNumber")
    protected BigInteger raceNumber;

    /**
     * Obtient la valeur de la propriété leg.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLeg()
    {
        return leg;
    }

    /**
     * Définit la valeur de la propriété leg.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLeg(BigInteger value)
    {
        this.leg = value;
    }

    /**
     * Obtient la valeur de la propriété legOrder.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLegOrder()
    {
        return legOrder;
    }

    /**
     * Définit la valeur de la propriété legOrder.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLegOrder(BigInteger value)
    {
        this.legOrder = value;
    }

    /**
     * Obtient la valeur de la propriété bibNumber.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBibNumber()
    {
        return bibNumber;
    }

    /**
     * Définit la valeur de la propriété bibNumber.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBibNumber(String value)
    {
        this.bibNumber = value;
    }

    /**
     * Obtient la valeur de la propriété startTime.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStartTime()
    {
        return startTime;
    }

    /**
     * Définit la valeur de la propriété startTime.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setStartTime(XMLGregorianCalendar value)
    {
        this.startTime = value;
    }

    /**
     * Obtient la valeur de la propriété course.
     *
     * @return possible object is
     * {@link SimpleCourse }
     */
    public SimpleCourse getCourse()
    {
        return course;
    }

    /**
     * Définit la valeur de la propriété course.
     *
     * @param value allowed object is
     *              {@link SimpleCourse }
     */
    public void setCourse(SimpleCourse value)
    {
        this.course = value;
    }

    /**
     * Gets the value of the controlCard property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlCard property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlCard().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlCard }
     */
    public List<ControlCard> getControlCard()
    {
        if (controlCard == null)
        {
            controlCard = new ArrayList<ControlCard>();
        }
        return this.controlCard;
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
     * Obtient la valeur de la propriété raceNumber.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getRaceNumber()
    {
        return raceNumber;
    }

    /**
     * Définit la valeur de la propriété raceNumber.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setRaceNumber(BigInteger value)
    {
        this.raceNumber = value;
    }

}
