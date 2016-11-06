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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contact information for a person, organisation or other entity.
 * <p>
 * <p>
 * <p>Classe Java pour Contact complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="PhoneNumber"/>
 *             &lt;enumeration value="MobilePhoneNumber"/>
 *             &lt;enumeration value="FaxNumber"/>
 *             &lt;enumeration value="EmailAddress"/>
 *             &lt;enumeration value="WebAddress"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
        "value"
})
public class Contact
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

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

    /**
     * Obtient la valeur de la propriété modifyTime.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getModifyTime()
    {
        return modifyTime;
    }

    /**
     * Définit la valeur de la propriété modifyTime.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setModifyTime(XMLGregorianCalendar value)
    {
        this.modifyTime = value;
    }

}
