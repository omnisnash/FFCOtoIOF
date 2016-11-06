//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Service requests made by a person.
 * <p>
 * <p>
 * <p>Classe Java pour PersonServiceRequest complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="PersonServiceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person"/>
 *         &lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonServiceRequest", propOrder = {
        "person",
        "serviceRequest"
})
public class PersonServiceRequest
{

    @XmlElement(name = "Person", required = true)
    protected Person person;
    @XmlElement(name = "ServiceRequest", required = true)
    protected List<ServiceRequest> serviceRequest;

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
     * Gets the value of the serviceRequest property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRequest property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRequest().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRequest }
     */
    public List<ServiceRequest> getServiceRequest()
    {
        if (serviceRequest == null)
        {
            serviceRequest = new ArrayList<ServiceRequest>();
        }
        return this.serviceRequest;
    }

}
