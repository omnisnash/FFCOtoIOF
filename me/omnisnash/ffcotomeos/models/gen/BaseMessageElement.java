//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The base message element that all message elements extend.
 * <p>
 * <p>
 * <p>Classe Java pour BaseMessageElement complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="BaseMessageElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="iofVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3.0" />
 *       &lt;attribute name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="creator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMessageElement")
@XmlSeeAlso({
        ServiceRequestList.class,
        ClassList.class,
        EntryList.class,
        EventList.class,
        StartList.class,
        CourseData.class,
        ResultList.class,
        OrganisationList.class,
        ControlCardList.class,
        CompetitorList.class
})
public abstract class BaseMessageElement
{

    @XmlAttribute(name = "iofVersion", required = true)
    protected String iofVersion;
    @XmlAttribute(name = "createTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlAttribute(name = "creator")
    protected String creator;

    /**
     * Obtient la valeur de la propriété iofVersion.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIofVersion()
    {
        if (iofVersion == null)
        {
            return "3.0";
        } else
        {
            return iofVersion;
        }
    }

    /**
     * Définit la valeur de la propriété iofVersion.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIofVersion(String value)
    {
        this.iofVersion = value;
    }

    /**
     * Obtient la valeur de la propriété createTime.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreateTime()
    {
        return createTime;
    }

    /**
     * Définit la valeur de la propriété createTime.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreateTime(XMLGregorianCalendar value)
    {
        this.createTime = value;
    }

    /**
     * Obtient la valeur de la propriété creator.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCreator()
    {
        return creator;
    }

    /**
     * Définit la valeur de la propriété creator.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreator(String value)
    {
        this.creator = value;
    }

}
