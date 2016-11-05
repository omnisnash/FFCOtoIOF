//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Defines a class in an event.
 *       
 * 
 * <p>Classe Java pour Class complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Class">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassType" type="{http://www.orienteering.org/datastandard/3.0}ClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Leg" type="{http://www.orienteering.org/datastandard/3.0}Leg" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TeamFee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.orienteering.org/datastandard/3.0}EventClassStatus" minOccurs="0"/>
 *         &lt;element name="RaceClass" type="{http://www.orienteering.org/datastandard/3.0}RaceClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TooFewEntriesSubstituteClass" type="{http://www.orienteering.org/datastandard/3.0}Class" minOccurs="0"/>
 *         &lt;element name="TooManyEntriesSubstituteClass" type="{http://www.orienteering.org/datastandard/3.0}Class" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="minAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sex" default="B">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="B"/>
 *             &lt;enumeration value="F"/>
 *             &lt;enumeration value="M"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="minNumberOfTeamMembers" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="maxNumberOfTeamMembers" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="minTeamAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxTeamAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="numberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxNumberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="resultListMode" default="Default">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Default"/>
 *             &lt;enumeration value="Unordered"/>
 *             &lt;enumeration value="UnorderedNoTimes"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Class", propOrder = {
    "id",
    "name",
    "shortName",
    "classType",
    "leg",
    "teamFee",
    "fee",
    "status",
    "raceClass",
    "tooFewEntriesSubstituteClass",
    "tooManyEntriesSubstituteClass",
    "extensions"
})
public class Class {

    @XmlElement(name = "Id")
    protected Id id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ShortName")
    protected String shortName;
    @XmlElement(name = "ClassType")
    protected List<ClassType> classType;
    @XmlElement(name = "Leg")
    protected List<Leg> leg;
    @XmlElement(name = "TeamFee")
    protected List<Fee> teamFee;
    @XmlElement(name = "Fee")
    protected List<Fee> fee;
    @XmlElement(name = "Status", defaultValue = "Normal")
    @XmlSchemaType(name = "NMTOKEN")
    protected EventClassStatus status;
    @XmlElement(name = "RaceClass")
    protected List<RaceClass> raceClass;
    @XmlElement(name = "TooFewEntriesSubstituteClass")
    protected Class tooFewEntriesSubstituteClass;
    @XmlElement(name = "TooManyEntriesSubstituteClass")
    protected Class tooManyEntriesSubstituteClass;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "minAge")
    protected BigInteger minAge;
    @XmlAttribute(name = "maxAge")
    protected BigInteger maxAge;
    @XmlAttribute(name = "sex")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sex;
    @XmlAttribute(name = "minNumberOfTeamMembers")
    protected BigInteger minNumberOfTeamMembers;
    @XmlAttribute(name = "maxNumberOfTeamMembers")
    protected BigInteger maxNumberOfTeamMembers;
    @XmlAttribute(name = "minTeamAge")
    protected BigInteger minTeamAge;
    @XmlAttribute(name = "maxTeamAge")
    protected BigInteger maxTeamAge;
    @XmlAttribute(name = "numberOfCompetitors")
    protected BigInteger numberOfCompetitors;
    @XmlAttribute(name = "maxNumberOfCompetitors")
    protected BigInteger maxNumberOfCompetitors;
    @XmlAttribute(name = "resultListMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String resultListMode;
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
     * Obtient la valeur de la propriété shortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Définit la valeur de la propriété shortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassType }
     * 
     * 
     */
    public List<ClassType> getClassType() {
        if (classType == null) {
            classType = new ArrayList<ClassType>();
        }
        return this.classType;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Leg }
     * 
     * 
     */
    public List<Leg> getLeg() {
        if (leg == null) {
            leg = new ArrayList<Leg>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the teamFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * 
     * 
     */
    public List<Fee> getTeamFee() {
        if (teamFee == null) {
            teamFee = new ArrayList<Fee>();
        }
        return this.teamFee;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * 
     * 
     */
    public List<Fee> getFee() {
        if (fee == null) {
            fee = new ArrayList<Fee>();
        }
        return this.fee;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link EventClassStatus }
     *     
     */
    public EventClassStatus getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassStatus }
     *     
     */
    public void setStatus(EventClassStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the raceClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raceClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRaceClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RaceClass }
     * 
     * 
     */
    public List<RaceClass> getRaceClass() {
        if (raceClass == null) {
            raceClass = new ArrayList<RaceClass>();
        }
        return this.raceClass;
    }

    /**
     * Obtient la valeur de la propriété tooFewEntriesSubstituteClass.
     * 
     * @return
     *     possible object is
     *     {@link Class }
     *     
     */
    public Class getTooFewEntriesSubstituteClass() {
        return tooFewEntriesSubstituteClass;
    }

    /**
     * Définit la valeur de la propriété tooFewEntriesSubstituteClass.
     * 
     * @param value
     *     allowed object is
     *     {@link Class }
     *     
     */
    public void setTooFewEntriesSubstituteClass(Class value) {
        this.tooFewEntriesSubstituteClass = value;
    }

    /**
     * Obtient la valeur de la propriété tooManyEntriesSubstituteClass.
     * 
     * @return
     *     possible object is
     *     {@link Class }
     *     
     */
    public Class getTooManyEntriesSubstituteClass() {
        return tooManyEntriesSubstituteClass;
    }

    /**
     * Définit la valeur de la propriété tooManyEntriesSubstituteClass.
     * 
     * @param value
     *     allowed object is
     *     {@link Class }
     *     
     */
    public void setTooManyEntriesSubstituteClass(Class value) {
        this.tooManyEntriesSubstituteClass = value;
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
     * Obtient la valeur de la propriété minAge.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinAge() {
        return minAge;
    }

    /**
     * Définit la valeur de la propriété minAge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinAge(BigInteger value) {
        this.minAge = value;
    }

    /**
     * Obtient la valeur de la propriété maxAge.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAge() {
        return maxAge;
    }

    /**
     * Définit la valeur de la propriété maxAge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAge(BigInteger value) {
        this.maxAge = value;
    }

    /**
     * Obtient la valeur de la propriété sex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        if (sex == null) {
            return "B";
        } else {
            return sex;
        }
    }

    /**
     * Définit la valeur de la propriété sex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Obtient la valeur de la propriété minNumberOfTeamMembers.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNumberOfTeamMembers() {
        if (minNumberOfTeamMembers == null) {
            return new BigInteger("1");
        } else {
            return minNumberOfTeamMembers;
        }
    }

    /**
     * Définit la valeur de la propriété minNumberOfTeamMembers.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinNumberOfTeamMembers(BigInteger value) {
        this.minNumberOfTeamMembers = value;
    }

    /**
     * Obtient la valeur de la propriété maxNumberOfTeamMembers.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfTeamMembers() {
        if (maxNumberOfTeamMembers == null) {
            return new BigInteger("1");
        } else {
            return maxNumberOfTeamMembers;
        }
    }

    /**
     * Définit la valeur de la propriété maxNumberOfTeamMembers.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfTeamMembers(BigInteger value) {
        this.maxNumberOfTeamMembers = value;
    }

    /**
     * Obtient la valeur de la propriété minTeamAge.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinTeamAge() {
        return minTeamAge;
    }

    /**
     * Définit la valeur de la propriété minTeamAge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinTeamAge(BigInteger value) {
        this.minTeamAge = value;
    }

    /**
     * Obtient la valeur de la propriété maxTeamAge.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxTeamAge() {
        return maxTeamAge;
    }

    /**
     * Définit la valeur de la propriété maxTeamAge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxTeamAge(BigInteger value) {
        this.maxTeamAge = value;
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
     * Obtient la valeur de la propriété maxNumberOfCompetitors.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfCompetitors() {
        return maxNumberOfCompetitors;
    }

    /**
     * Définit la valeur de la propriété maxNumberOfCompetitors.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfCompetitors(BigInteger value) {
        this.maxNumberOfCompetitors = value;
    }

    /**
     * Obtient la valeur de la propriété resultListMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultListMode() {
        if (resultListMode == null) {
            return "Default";
        } else {
            return resultListMode;
        }
    }

    /**
     * Définit la valeur de la propriété resultListMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultListMode(String value) {
        this.resultListMode = value;
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
