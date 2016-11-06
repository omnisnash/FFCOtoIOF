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


/**
 * Used to state start time allocation requests. It consists of a possible reference Organisation or Person and the allocation request, e.g. late start or grouped with the reference Organisation/Person. This way it is possible to state requests to the event organizer so that e.g. all members of an organisation has start times close to each other - or parents have start times far from each other. It is totally up to the event software and organizers whether they will support such requests.
 * <p>
 * <p>
 * <p>Classe Java pour StartTimeAllocationRequest complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="StartTimeAllocationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" minOccurs="0"/>
 *         &lt;element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" default="Normal">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Normal"/>
 *             &lt;enumeration value="EarlyStart"/>
 *             &lt;enumeration value="LateStart"/>
 *             &lt;enumeration value="SeparatedFrom"/>
 *             &lt;enumeration value="GroupedWith"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartTimeAllocationRequest", propOrder = {
        "organisation",
        "person"
})
public class StartTimeAllocationRequest
{

    @XmlElement(name = "Organisation")
    protected Organisation organisation;
    @XmlElement(name = "Person")
    protected Person person;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Obtient la valeur de la propriété organisation.
     *
     * @return possible object is
     * {@link Organisation }
     */
    public Organisation getOrganisation()
    {
        return organisation;
    }

    /**
     * Définit la valeur de la propriété organisation.
     *
     * @param value allowed object is
     *              {@link Organisation }
     */
    public void setOrganisation(Organisation value)
    {
        this.organisation = value;
    }

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
     * Obtient la valeur de la propriété type.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType()
    {
        if (type == null)
        {
            return "Normal";
        } else
        {
            return type;
        }
    }

    /**
     * Définit la valeur de la propriété type.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value)
    {
        this.type = value;
    }

}
