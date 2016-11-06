//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models.gen;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * Defines an image file, either as a link (use the url attribute) or as base64-encoded binary data.
 * <p>
 * <p>
 * <p>Classe Java pour Image complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="Image">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mediaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="resolution" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
        "value"
})
public class Image
{

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "mediaType", required = true)
    protected String mediaType;
    @XmlAttribute(name = "width")
    protected BigInteger width;
    @XmlAttribute(name = "height")
    protected BigInteger height;
    @XmlAttribute(name = "resolution")
    protected Double resolution;

    /**
     * Obtient la valeur de la propriété value.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getValue()
    {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setValue(byte[] value)
    {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété url.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * Définit la valeur de la propriété url.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUrl(String value)
    {
        this.url = value;
    }

    /**
     * Obtient la valeur de la propriété mediaType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMediaType()
    {
        return mediaType;
    }

    /**
     * Définit la valeur de la propriété mediaType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMediaType(String value)
    {
        this.mediaType = value;
    }

    /**
     * Obtient la valeur de la propriété width.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getWidth()
    {
        return width;
    }

    /**
     * Définit la valeur de la propriété width.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setWidth(BigInteger value)
    {
        this.width = value;
    }

    /**
     * Obtient la valeur de la propriété height.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getHeight()
    {
        return height;
    }

    /**
     * Définit la valeur de la propriété height.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setHeight(BigInteger value)
    {
        this.height = value;
    }

    /**
     * Obtient la valeur de la propriété resolution.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getResolution()
    {
        return resolution;
    }

    /**
     * Définit la valeur de la propriété resolution.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setResolution(Double value)
    {
        this.resolution = value;
    }

}
