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
 * Represents information about a person in a competition context, i.e. including organisation and control card.
 * <p>
 * <p>
 * <p>Classe Java pour Competitor complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="Competitor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person"/>
 *         &lt;element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://www.orienteering.org/datastandard/3.0}Score" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Competitor", propOrder = {
        "person",
        "organisation",
        "controlCard",
        "clazz",
        "score",
        "extensions"
})
public class Competitor
{

    @XmlElement(name = "Person", required = true)
    protected Person person;
    @XmlElement(name = "Organisation")
    protected List<Organisation> organisation;
    @XmlElement(name = "ControlCard")
    protected List<ControlCard> controlCard;
    @XmlElement(name = "Class")
    protected List<Class> clazz;
    @XmlElement(name = "Score")
    protected List<Score> score;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

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
     * Gets the value of the score property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the score property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScore().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Score }
     */
    public List<Score> getScore()
    {
        if (score == null)
        {
            score = new ArrayList<Score>();
        }
        return this.score;
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
