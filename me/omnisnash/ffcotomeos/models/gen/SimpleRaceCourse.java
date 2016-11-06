//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * Defines a course for a certain race, excluding controls.
 * <p>
 * <p>
 * <p>Classe Java pour SimpleRaceCourse complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="SimpleRaceCourse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.orienteering.org/datastandard/3.0}SimpleCourse">
 *       &lt;attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleRaceCourse")
public class SimpleRaceCourse
        extends SimpleCourse
{

    @XmlAttribute(name = "raceNumber")
    protected BigInteger raceNumber;

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
