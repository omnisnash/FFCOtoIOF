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
 * <p>Classe Java pour RaceDiscipline.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RaceDiscipline">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Sprint"/>
 *     &lt;enumeration value="Middle"/>
 *     &lt;enumeration value="Long"/>
 *     &lt;enumeration value="Ultralong"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RaceDiscipline")
@XmlEnum
public enum RaceDiscipline {

    @XmlEnumValue("Sprint")
    SPRINT("Sprint"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("Ultralong")
    ULTRALONG("Ultralong"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RaceDiscipline(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RaceDiscipline fromValue(String v) {
        for (RaceDiscipline c: RaceDiscipline.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
