//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.07 à 10:43:15 PM CET 
//


package me.omnisnash.ffcotoiof.models.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Element that connects a number of team members in a relay team to a number of courses. Teams are matched
 *                 by 1) BibNumber, 2) TeamName+ClassName.
 *             
 * 
 * <p>Classe Java pour TeamCourseAssignment complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TeamCourseAssignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}TeamMemberCourseAssignment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TeamCourseAssignment", propOrder = {
    "bibNumber",
    "teamName",
    "className",
    "teamMemberCourseAssignment",
    "extensions"
})
public class TeamCourseAssignment {

    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    @XmlElement(name = "TeamName")
    protected String teamName;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "TeamMemberCourseAssignment")
    protected List<TeamMemberCourseAssignment> teamMemberCourseAssignment;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

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
     * Obtient la valeur de la propriété teamName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Définit la valeur de la propriété teamName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Obtient la valeur de la propriété className.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Définit la valeur de la propriété className.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the teamMemberCourseAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamMemberCourseAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamMemberCourseAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberCourseAssignment }
     * 
     * 
     */
    public List<TeamMemberCourseAssignment> getTeamMemberCourseAssignment() {
        if (teamMemberCourseAssignment == null) {
            teamMemberCourseAssignment = new ArrayList<TeamMemberCourseAssignment>();
        }
        return this.teamMemberCourseAssignment;
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
