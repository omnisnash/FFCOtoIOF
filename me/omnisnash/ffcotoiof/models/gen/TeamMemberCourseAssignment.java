//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.07 à 10:43:15 PM CET 
//


package me.omnisnash.ffcotoiof.models.gen;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Element that connects a course with a relay team member. Courses should be present in the RaceCourseData
 *                 element and are matched on course name and/or course family. Team members are matched by 1) BibNumber,
 *                 2) Leg and LegOrder, 3) EntryId.
 *             
 * 
 * <p>Classe Java pour TeamMemberCourseAssignment complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TeamMemberCourseAssignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntryId" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         &lt;element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Leg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TeamMemberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CourseFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamMemberCourseAssignment", propOrder = {
    "entryId",
    "bibNumber",
    "leg",
    "legOrder",
    "teamMemberName",
    "courseName",
    "courseFamily",
    "extensions"
})
public class TeamMemberCourseAssignment {

    @XmlElement(name = "EntryId")
    protected Id entryId;
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    @XmlElement(name = "Leg")
    protected BigInteger leg;
    @XmlElement(name = "LegOrder")
    protected BigInteger legOrder;
    @XmlElement(name = "TeamMemberName")
    protected String teamMemberName;
    @XmlElement(name = "CourseName")
    protected String courseName;
    @XmlElement(name = "CourseFamily")
    protected String courseFamily;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Obtient la valeur de la propriété entryId.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getEntryId() {
        return entryId;
    }

    /**
     * Définit la valeur de la propriété entryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setEntryId(Id value) {
        this.entryId = value;
    }

    /**
     * Obtient la valeur de la propriété bibNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBibNumber() {
        return bibNumber;
    }

    /**
     * Définit la valeur de la propriété bibNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBibNumber(String value) {
        this.bibNumber = value;
    }

    /**
     * Obtient la valeur de la propriété leg.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeg() {
        return leg;
    }

    /**
     * Définit la valeur de la propriété leg.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeg(BigInteger value) {
        this.leg = value;
    }

    /**
     * Obtient la valeur de la propriété legOrder.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegOrder() {
        return legOrder;
    }

    /**
     * Définit la valeur de la propriété legOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLegOrder(BigInteger value) {
        this.legOrder = value;
    }

    /**
     * Obtient la valeur de la propriété teamMemberName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberName() {
        return teamMemberName;
    }

    /**
     * Définit la valeur de la propriété teamMemberName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberName(String value) {
        this.teamMemberName = value;
    }

    /**
     * Obtient la valeur de la propriété courseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Définit la valeur de la propriété courseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseName(String value) {
        this.courseName = value;
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

}
