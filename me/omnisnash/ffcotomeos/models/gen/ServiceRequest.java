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
 * <p>Classe Java pour ServiceRequest complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="ServiceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.orienteering.org/datastandard/3.0}Service"/>
 *         &lt;element name="RequestedQuantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DeliveredQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequest", propOrder = {
        "id",
        "service",
        "requestedQuantity",
        "deliveredQuantity",
        "comment",
        "assignedFee",
        "extensions"
})
public class ServiceRequest
{

    @XmlElement(name = "Id")
    protected Id id;
    @XmlElement(name = "Service", required = true)
    protected Service service;
    @XmlElement(name = "RequestedQuantity")
    protected double requestedQuantity;
    @XmlElement(name = "DeliveredQuantity")
    protected Double deliveredQuantity;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "AssignedFee")
    protected List<AssignedFee> assignedFee;
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
     * Obtient la valeur de la propriété service.
     *
     * @return possible object is
     * {@link Service }
     */
    public Service getService()
    {
        return service;
    }

    /**
     * Définit la valeur de la propriété service.
     *
     * @param value allowed object is
     *              {@link Service }
     */
    public void setService(Service value)
    {
        this.service = value;
    }

    /**
     * Obtient la valeur de la propriété requestedQuantity.
     */
    public double getRequestedQuantity()
    {
        return requestedQuantity;
    }

    /**
     * Définit la valeur de la propriété requestedQuantity.
     */
    public void setRequestedQuantity(double value)
    {
        this.requestedQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété deliveredQuantity.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDeliveredQuantity()
    {
        return deliveredQuantity;
    }

    /**
     * Définit la valeur de la propriété deliveredQuantity.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setDeliveredQuantity(Double value)
    {
        this.deliveredQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété comment.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Définit la valeur de la propriété comment.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComment(String value)
    {
        this.comment = value;
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
