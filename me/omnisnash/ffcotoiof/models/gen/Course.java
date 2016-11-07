//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.07 à 10:43:15 PM CET 
//


package me.omnisnash.ffcotoiof.models.gen;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                 Defines a course, i.e. a number of controls including start and finish.
 *             
 * 
 * <p>Classe Java pour Course complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Course">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CourseFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Climb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CourseControl" type="{http://www.orienteering.org/datastandard/3.0}CourseControl" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="MapId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Course", propOrder = {
    "id",
    "name",
    "courseFamily",
    "length",
    "climb",
    "courseControl",
    "mapId",
    "extensions"
})
public class Course {

    @XmlElement(name = "Id")
    protected Id id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "CourseFamily")
    protected String courseFamily;
    @XmlElement(name = "Length")
    protected Double length;
    @XmlElement(name = "Climb")
    protected Double climb;
    @XmlElement(name = "CourseControl", required = true)
    protected List<CourseControl> courseControl;
    @XmlElement(name = "MapId")
    protected BigInteger mapId;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "numberOfCompetitors")
    protected BigInteger numberOfCompetitors;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété courseFamily.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseFamily() {
        return courseFamily;
    }

    /**
     * Définit la valeur de la propriété courseFamily.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseFamily(String value) {
        this.courseFamily = value;
    }

    /**
     * Obtient la valeur de la propriété length.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLength() {
        return length;
    }

    /**
     * Définit la valeur de la propriété length.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLength(Double value) {
        this.length = value;
    }

    /**
     * Obtient la valeur de la propriété climb.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClimb() {
        return climb;
    }

    /**
     * Définit la valeur de la propriété climb.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClimb(Double value) {
        this.climb = value;
    }

    /**
     * Gets the value of the courseControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseControl }
     * 
     * 
     */
    public List<CourseControl> getCourseControl() {
        if (courseControl == null) {
            courseControl = new ArrayList<CourseControl>();
        }
        return this.courseControl;
    }

    /**
     * Obtient la valeur de la propriété mapId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMapId() {
        return mapId;
    }

    /**
     * Définit la valeur de la propriété mapId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMapId(BigInteger value) {
        this.mapId = value;
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfCompetitors.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCompetitors() {
        return numberOfCompetitors;
    }

    /**
     * Définit la valeur de la propriété numberOfCompetitors.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCompetitors(BigInteger value) {
        this.numberOfCompetitors = value;
    }

    /**
     * Obtient la valeur de la propriété modifyTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyTime() {
        return modifyTime;
    }

    /**
     * Définit la valeur de la propriété modifyTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyTime(XMLGregorianCalendar value) {
        this.modifyTime = value;
    }

}
