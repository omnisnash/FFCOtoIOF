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
 * <p>Classe Java pour OverallResult complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="OverallResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TimeBehind" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.orienteering.org/datastandard/3.0}ResultStatus"/>
 *         &lt;element name="Score" type="{http://www.orienteering.org/datastandard/3.0}Score" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallResult", propOrder = {
        "time",
        "timeBehind",
        "position",
        "status",
        "score",
        "extensions"
})
public class OverallResult
{

    @XmlElement(name = "Time")
    protected Double time;
    @XmlElement(name = "TimeBehind")
    protected Double timeBehind;
    @XmlElement(name = "Position")
    protected BigInteger position;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected ResultStatus status;
    @XmlElement(name = "Score")
    protected List<Score> score;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Obtient la valeur de la propriété time.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTime()
    {
        return time;
    }

    /**
     * Définit la valeur de la propriété time.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setTime(Double value)
    {
        this.time = value;
    }

    /**
     * Obtient la valeur de la propriété timeBehind.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTimeBehind()
    {
        return timeBehind;
    }

    /**
     * Définit la valeur de la propriété timeBehind.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setTimeBehind(Double value)
    {
        this.timeBehind = value;
    }

    /**
     * Obtient la valeur de la propriété position.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPosition()
    {
        return position;
    }

    /**
     * Définit la valeur de la propriété position.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPosition(BigInteger value)
    {
        this.position = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     *
     * @return possible object is
     * {@link ResultStatus }
     */
    public ResultStatus getStatus()
    {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     *
     * @param value allowed object is
     *              {@link ResultStatus }
     */
    public void setStatus(ResultStatus value)
    {
        this.status = value;
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

}
