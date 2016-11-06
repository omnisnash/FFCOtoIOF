//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;


/**
 * A role defines a connection between a person and some kind of task, responsibility or engagement, e.g. being a course setter at an event.
 * <p>
 * <p>
 * <p>Classe Java pour Role complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="Role">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role", propOrder = {
        "person"
})
public class Role
{

    @XmlElement(name = "Person", required = true)
    protected Person person;
    @XmlAttribute(name = "type", required = true)
    protected String type;

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
        return type;
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
