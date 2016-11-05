//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.04 à 11:50:13 PM CET 
//


package me.omnisnash.ffcotomeos.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Map information, used in course setting software with regard to the "real" map.
 *       
 * 
 * <p>Classe Java pour Map complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Map">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.orienteering.org/datastandard/3.0}Image" minOccurs="0"/>
 *         &lt;element name="Scale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MapPositionTopLeft" type="{http://www.orienteering.org/datastandard/3.0}MapPosition"/>
 *         &lt;element name="MapPositionBottomRight" type="{http://www.orienteering.org/datastandard/3.0}MapPosition"/>
 *         &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Map", propOrder = {
    "id",
    "image",
    "scale",
    "mapPositionTopLeft",
    "mapPositionBottomRight",
    "extensions"
})
public class Map {

    @XmlElement(name = "Id")
    protected Id id;
    @XmlElement(name = "Image")
    protected Image image;
    @XmlElement(name = "Scale")
    protected double scale;
    @XmlElement(name = "MapPositionTopLeft", required = true)
    protected MapPosition mapPositionTopLeft;
    @XmlElement(name = "MapPositionBottomRight", required = true)
    protected MapPosition mapPositionBottomRight;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété image.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Définit la valeur de la propriété image.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Obtient la valeur de la propriété scale.
     * 
     */
    public double getScale() {
        return scale;
    }

    /**
     * Définit la valeur de la propriété scale.
     * 
     */
    public void setScale(double value) {
        this.scale = value;
    }

    /**
     * Obtient la valeur de la propriété mapPositionTopLeft.
     * 
     * @return
     *     possible object is
     *     {@link MapPosition }
     *     
     */
    public MapPosition getMapPositionTopLeft() {
        return mapPositionTopLeft;
    }

    /**
     * Définit la valeur de la propriété mapPositionTopLeft.
     * 
     * @param value
     *     allowed object is
     *     {@link MapPosition }
     *     
     */
    public void setMapPositionTopLeft(MapPosition value) {
        this.mapPositionTopLeft = value;
    }

    /**
     * Obtient la valeur de la propriété mapPositionBottomRight.
     * 
     * @return
     *     possible object is
     *     {@link MapPosition }
     *     
     */
    public MapPosition getMapPositionBottomRight() {
        return mapPositionBottomRight;
    }

    /**
     * Définit la valeur de la propriété mapPositionBottomRight.
     * 
     * @param value
     *     allowed object is
     *     {@link MapPosition }
     *     
     */
    public void setMapPositionBottomRight(MapPosition value) {
        this.mapPositionBottomRight = value;
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}
