//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.07 à 10:43:15 PM CET 
//


package me.omnisnash.ffcotoiof.models.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EventForm.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EventForm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="Team"/>
 *     &lt;enumeration value="Relay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventForm")
@XmlEnum
public enum EventForm {

    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Team")
    TEAM("Team"),
    @XmlEnumValue("Relay")
    RELAY("Relay");
    private final String value;

    EventForm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventForm fromValue(String v) {
        for (EventForm c: EventForm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
