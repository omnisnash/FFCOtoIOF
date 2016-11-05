//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RaceClassStatus.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RaceClassStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="StartTimesNotAllocated"/>
 *     &lt;enumeration value="StartTimesAllocated"/>
 *     &lt;enumeration value="NotUsed"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Invalidated"/>
 *     &lt;enumeration value="InvalidatedNoFee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RaceClassStatus")
@XmlEnum
public enum RaceClassStatus {


    /**
     * 
     *             The start list draw has not been made for this class in this race.
     *           
     * 
     */
    @XmlEnumValue("StartTimesNotAllocated")
    START_TIMES_NOT_ALLOCATED("StartTimesNotAllocated"),

    /**
     * 
     *             The start list draw has been made for this class in this race.
     *           
     * 
     */
    @XmlEnumValue("StartTimesAllocated")
    START_TIMES_ALLOCATED("StartTimesAllocated"),

    /**
     * 
     *             The class is not organised in this race, e.g. for classes that are organised in only some of the races in a multi-race event.
     *           
     * 
     */
    @XmlEnumValue("NotUsed")
    NOT_USED("NotUsed"),

    /**
     * 
     *             The result list is complete for this class in this race.
     *           
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * 
     *             The results are considered invalid due to technical issues such as misplaced controls. Entry fees are not refunded.
     *           
     * 
     */
    @XmlEnumValue("Invalidated")
    INVALIDATED("Invalidated"),

    /**
     * 
     *             The results are considered invalid due to technical issues such as misplaced controls. Entry fees are refunded.
     *           
     * 
     */
    @XmlEnumValue("InvalidatedNoFee")
    INVALIDATED_NO_FEE("InvalidatedNoFee");
    private final String value;

    RaceClassStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RaceClassStatus fromValue(String v) {
        for (RaceClassStatus c: RaceClassStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
