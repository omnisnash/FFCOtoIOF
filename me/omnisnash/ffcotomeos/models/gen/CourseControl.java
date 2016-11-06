//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * A control included in a particular course.
 * <p>
 * <p>
 * <p>Classe Java pour CourseControl complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="CourseControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Control" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="MapText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapTextPosition" type="{http://www.orienteering.org/datastandard/3.0}MapPosition" minOccurs="0"/>
 *         &lt;element name="LegLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.orienteering.org/datastandard/3.0}ControlType" />
 *       &lt;attribute name="randomOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="specialInstruction" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="TapedRoute"/>
 *             &lt;enumeration value="FunnelTapedRoute"/>
 *             &lt;enumeration value="MandatoryCrossingPoint"/>
 *             &lt;enumeration value="MandatoryOutOfBoundsAreaPassage"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="tapedRouteLength" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseControl", propOrder = {
        "control",
        "mapText",
        "mapTextPosition",
        "legLength",
        "score",
        "extensions"
})
public class CourseControl
{

    @XmlElement(name = "Control", required = true)
    protected List<String> control;
    @XmlElement(name = "MapText")
    protected String mapText;
    @XmlElement(name = "MapTextPosition")
    protected MapPosition mapTextPosition;
    @XmlElement(name = "LegLength")
    protected Double legLength;
    @XmlElement(name = "Score")
    protected Double score;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "type")
    protected ControlType type;
    @XmlAttribute(name = "randomOrder")
    protected Boolean randomOrder;
    @XmlAttribute(name = "specialInstruction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String specialInstruction;
    @XmlAttribute(name = "tapedRouteLength")
    protected Double tapedRouteLength;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

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
     * {@link String }
     */
    public List<String> getControl()
    {
        if (control == null)
        {
            control = new ArrayList<String>();
        }
        return this.control;
    }

    /**
     * Obtient la valeur de la propriété mapText.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMapText()
    {
        return mapText;
    }

    /**
     * Définit la valeur de la propriété mapText.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMapText(String value)
    {
        this.mapText = value;
    }

    /**
     * Obtient la valeur de la propriété mapTextPosition.
     *
     * @return possible object is
     * {@link MapPosition }
     */
    public MapPosition getMapTextPosition()
    {
        return mapTextPosition;
    }

    /**
     * Définit la valeur de la propriété mapTextPosition.
     *
     * @param value allowed object is
     *              {@link MapPosition }
     */
    public void setMapTextPosition(MapPosition value)
    {
        this.mapTextPosition = value;
    }

    /**
     * Obtient la valeur de la propriété legLength.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLegLength()
    {
        return legLength;
    }

    /**
     * Définit la valeur de la propriété legLength.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setLegLength(Double value)
    {
        this.legLength = value;
    }

    /**
     * Obtient la valeur de la propriété score.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getScore()
    {
        return score;
    }

    /**
     * Définit la valeur de la propriété score.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setScore(Double value)
    {
        this.score = value;
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
     * Obtient la valeur de la propriété type.
     *
     * @return possible object is
     * {@link ControlType }
     */
    public ControlType getType()
    {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     *
     * @param value allowed object is
     *              {@link ControlType }
     */
    public void setType(ControlType value)
    {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété randomOrder.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isRandomOrder()
    {
        if (randomOrder == null)
        {
            return false;
        } else
        {
            return randomOrder;
        }
    }

    /**
     * Définit la valeur de la propriété randomOrder.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRandomOrder(Boolean value)
    {
        this.randomOrder = value;
    }

    /**
     * Obtient la valeur de la propriété specialInstruction.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpecialInstruction()
    {
        if (specialInstruction == null)
        {
            return "None";
        } else
        {
            return specialInstruction;
        }
    }

    /**
     * Définit la valeur de la propriété specialInstruction.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpecialInstruction(String value)
    {
        this.specialInstruction = value;
    }

    /**
     * Obtient la valeur de la propriété tapedRouteLength.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTapedRouteLength()
    {
        return tapedRouteLength;
    }

    /**
     * Définit la valeur de la propriété tapedRouteLength.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setTapedRouteLength(Double value)
    {
        this.tapedRouteLength = value;
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
