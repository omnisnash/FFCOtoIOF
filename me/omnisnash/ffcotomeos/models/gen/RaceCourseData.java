//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * This element defines all the control and course information for a race.
 * <p>
 * <p>
 * <p>Classe Java pour RaceCourseData complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="RaceCourseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Map" type="{http://www.orienteering.org/datastandard/3.0}Map" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Control" type="{http://www.orienteering.org/datastandard/3.0}Control" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Course" type="{http://www.orienteering.org/datastandard/3.0}Course" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClassCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}ClassCourseAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}PersonCourseAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TeamCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}TeamCourseAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RaceCourseData", propOrder = {
        "map",
        "control",
        "course",
        "classCourseAssignment",
        "personCourseAssignment",
        "teamCourseAssignment",
        "extensions"
})
public class RaceCourseData
{

    @XmlElement(name = "Map")
    protected List<Map> map;
    @XmlElement(name = "Control")
    protected List<Control> control;
    @XmlElement(name = "Course")
    protected List<Course> course;
    @XmlElement(name = "ClassCourseAssignment")
    protected List<ClassCourseAssignment> classCourseAssignment;
    @XmlElement(name = "PersonCourseAssignment")
    protected List<PersonCourseAssignment> personCourseAssignment;
    @XmlElement(name = "TeamCourseAssignment")
    protected List<TeamCourseAssignment> teamCourseAssignment;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "raceNumber")
    protected BigInteger raceNumber;

    /**
     * Gets the value of the map property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the map property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMap().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Map }
     */
    public List<Map> getMap()
    {
        if (map == null)
        {
            map = new ArrayList<Map>();
        }
        return this.map;
    }

    /**
     * Gets the value of the control property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the control property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControl().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Control }
     */
    public List<Control> getControl()
    {
        if (control == null)
        {
            control = new ArrayList<Control>();
        }
        return this.control;
    }

    /**
     * Gets the value of the course property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the course property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourse().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Course }
     */
    public List<Course> getCourse()
    {
        if (course == null)
        {
            course = new ArrayList<Course>();
        }
        return this.course;
    }

    /**
     * Gets the value of the classCourseAssignment property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCourseAssignment property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCourseAssignment().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassCourseAssignment }
     */
    public List<ClassCourseAssignment> getClassCourseAssignment()
    {
        if (classCourseAssignment == null)
        {
            classCourseAssignment = new ArrayList<ClassCourseAssignment>();
        }
        return this.classCourseAssignment;
    }

    /**
     * Gets the value of the personCourseAssignment property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personCourseAssignment property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonCourseAssignment().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonCourseAssignment }
     */
    public List<PersonCourseAssignment> getPersonCourseAssignment()
    {
        if (personCourseAssignment == null)
        {
            personCourseAssignment = new ArrayList<PersonCourseAssignment>();
        }
        return this.personCourseAssignment;
    }

    /**
     * Gets the value of the teamCourseAssignment property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamCourseAssignment property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamCourseAssignment().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamCourseAssignment }
     */
    public List<TeamCourseAssignment> getTeamCourseAssignment()
    {
        if (teamCourseAssignment == null)
        {
            teamCourseAssignment = new ArrayList<TeamCourseAssignment>();
        }
        return this.teamCourseAssignment;
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
