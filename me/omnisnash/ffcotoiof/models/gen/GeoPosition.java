//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.07 à 10:43:15 PM CET 
//


package me.omnisnash.ffcotoiof.models.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Defines a geographical position, e.g. of a control.
 *             
 * 
 * <p>Classe Java pour GeoPosition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeoPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="lng" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="lat" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="alt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoPosition")
public class GeoPosition {

    @XmlAttribute(name = "lng", required = true)
    protected double lng;
    @XmlAttribute(name = "lat", required = true)
    protected double lat;
    @XmlAttribute(name = "alt")
    protected Double alt;

    /**
     * Obtient la valeur de la propriété lng.
     * 
     */
    public double getLng() {
        return lng;
    }

    /**
     * Définit la valeur de la propriété lng.
     * 
     */
    public void setLng(double value) {
        this.lng = value;
    }

    /**
     * Obtient la valeur de la propriété lat.
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * Définit la valeur de la propriété lat.
     * 
     */
    public void setLat(double value) {
        this.lat = value;
    }

    /**
     * Obtient la valeur de la propriété alt.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAlt() {
        return alt;
    }

    /**
     * Définit la valeur de la propriété alt.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAlt(Double value) {
        this.alt = value;
    }

}
