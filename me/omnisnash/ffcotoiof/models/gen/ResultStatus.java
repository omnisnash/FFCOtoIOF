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
 * <p>Classe Java pour ResultStatus.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Finished"/>
 *     &lt;enumeration value="MissingPunch"/>
 *     &lt;enumeration value="Disqualified"/>
 *     &lt;enumeration value="DidNotFinish"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="OverTime"/>
 *     &lt;enumeration value="SportingWithdrawal"/>
 *     &lt;enumeration value="NotCompeting"/>
 *     &lt;enumeration value="Moved"/>
 *     &lt;enumeration value="MovedUp"/>
 *     &lt;enumeration value="DidNotStart"/>
 *     &lt;enumeration value="DidNotEnter"/>
 *     &lt;enumeration value="Cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultStatus")
@XmlEnum
public enum ResultStatus {


    /**
     * 
     *                         Finished and validated.
     *                     
     * 
     */
    OK("OK"),

    /**
     * 
     *                         Finished but not yet validated.
     *                     
     * 
     */
    @XmlEnumValue("Finished")
    FINISHED("Finished"),

    /**
     * 
     *                         Missing punch.
     *                     
     * 
     */
    @XmlEnumValue("MissingPunch")
    MISSING_PUNCH("MissingPunch"),

    /**
     * 
     *                         Disqualified (for some other reason than a missing punch).
     *                     
     * 
     */
    @XmlEnumValue("Disqualified")
    DISQUALIFIED("Disqualified"),

    /**
     * 
     *                         Did not finish (i.e. conciously cancelling the race after having started, in contrast to
     *                         MissingPunch).
     *                     
     * 
     */
    @XmlEnumValue("DidNotFinish")
    DID_NOT_FINISH("DidNotFinish"),

    /**
     * 
     *                         Currently on course.
     *                     
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     *                         Has not yet started.
     *                     
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * 
     *                         Overtime, i.e. did not finish within the maximum time set by the organiser.
     *                     
     * 
     */
    @XmlEnumValue("OverTime")
    OVER_TIME("OverTime"),

    /**
     * 
     *                         Sporting withdrawal (e.g. helping an injured competitor).
     *                     
     * 
     */
    @XmlEnumValue("SportingWithdrawal")
    SPORTING_WITHDRAWAL("SportingWithdrawal"),

    /**
     * 
     *                         Not competing (i.e. running outside the competition).
     *                     
     * 
     */
    @XmlEnumValue("NotCompeting")
    NOT_COMPETING("NotCompeting"),

    /**
     * 
     *                         Moved to another class.
     *                     
     * 
     */
    @XmlEnumValue("Moved")
    MOVED("Moved"),

    /**
     * 
     *                         Moved to a "better" class, in case of entry restrictions.
     *                     
     * 
     */
    @XmlEnumValue("MovedUp")
    MOVED_UP("MovedUp"),

    /**
     * 
     *                         Did not start (in this race).
     *                     
     * 
     */
    @XmlEnumValue("DidNotStart")
    DID_NOT_START("DidNotStart"),

    /**
     * 
     *                         Did not enter (in this race).
     *                     
     * 
     */
    @XmlEnumValue("DidNotEnter")
    DID_NOT_ENTER("DidNotEnter"),

    /**
     * 
     *                         The competitor has cancelled his/hers entry.
     *                     
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    ResultStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultStatus fromValue(String v) {
        for (ResultStatus c: ResultStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
