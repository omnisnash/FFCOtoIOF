//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * Defines the name of the start place (e.g. Start 1), if the race has multiple start places.
 * <p>
 * <p>
 * <p>Classe Java pour StartName complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="StartName">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartName", propOrder = {
        "value"
})
public class StartName
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "raceNumber")
    protected BigInteger raceNumber;

    /**
     * Obtient la valeur de la propriété value.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue()
    {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value)
    {
        this.value = value;
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
