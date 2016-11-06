//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ControlType.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ControlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Control"/>
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="Finish"/>
 *     &lt;enumeration value="CrossingPoint"/>
 *     &lt;enumeration value="EndOfMarkedRoute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ControlType")
@XmlEnum
public enum ControlType
{

    @XmlEnumValue("Control")
    CONTROL("Control"),
    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Finish")
    FINISH("Finish"),
    @XmlEnumValue("CrossingPoint")
    CROSSING_POINT("CrossingPoint"),
    @XmlEnumValue("EndOfMarkedRoute")
    END_OF_MARKED_ROUTE("EndOfMarkedRoute");
    private final String value;

    ControlType(String v)
    {
        value = v;
    }

    public static ControlType fromValue(String v)
    {
        for (ControlType c : ControlType.values())
        {
            if (c.value.equals(v))
            {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value()
    {
        return value;
    }

}
