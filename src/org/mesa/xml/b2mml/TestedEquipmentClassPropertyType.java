//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.06 at 04:41:16 AM EST 
//


package org.mesa.xml.b2mml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestedEquipmentClassPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestedEquipmentClassPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentClassID" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentClassIDType"/>
 *         &lt;element name="PropertyID" type="{http://www.mesa.org/xml/B2MML-V0600}PropertyIDType"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}TestedEquipmentClassProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestedEquipmentClassPropertyType", propOrder = {
    "equipmentClassID",
    "propertyID"
})
public class TestedEquipmentClassPropertyType {

    @XmlElement(name = "EquipmentClassID", required = true)
    protected EquipmentClassIDType equipmentClassID;
    @XmlElement(name = "PropertyID", required = true)
    protected PropertyIDType propertyID;

    /**
     * Gets the value of the equipmentClassID property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentClassIDType }
     *     
     */
    public EquipmentClassIDType getEquipmentClassID() {
        return equipmentClassID;
    }

    /**
     * Sets the value of the equipmentClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentClassIDType }
     *     
     */
    public void setEquipmentClassID(EquipmentClassIDType value) {
        this.equipmentClassID = value;
    }

    /**
     * Gets the value of the propertyID property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIDType }
     *     
     */
    public PropertyIDType getPropertyID() {
        return propertyID;
    }

    /**
     * Sets the value of the propertyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIDType }
     *     
     */
    public void setPropertyID(PropertyIDType value) {
        this.propertyID = value;
    }

}
