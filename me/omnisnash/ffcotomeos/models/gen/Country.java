//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;


/**
 * Defines the name of the country.
 * <p>
 * <p>
 * <p>Classe Java pour Country complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="Country">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country", propOrder = {
        "value"
})
public class Country
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "code", required = true)
    protected String code;

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
     * Obtient la valeur de la propriété code.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCode(String value)
    {
        this.code = value;
    }

}
