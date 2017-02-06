//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.06 at 04:41:19 AM EST 
//


package org.mesa.xml.b2mml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestedMaterialDefinitionPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestedMaterialDefinitionPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaterialDefinitionID" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialDefinitionIDType"/>
 *         &lt;element name="PropertyID" type="{http://www.mesa.org/xml/B2MML-V0600}PropertyIDType"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}TestedMaterialDefinitionProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestedMaterialDefinitionPropertyType", propOrder = {
    "materialDefinitionID",
    "propertyID"
})
public class TestedMaterialDefinitionPropertyType
    implements Serializable
{

    @XmlElement(name = "MaterialDefinitionID", required = true)
    protected MaterialDefinitionIDType materialDefinitionID;
    @XmlElement(name = "PropertyID", required = true)
    protected PropertyIDType propertyID;

    /**
     * Gets the value of the materialDefinitionID property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialDefinitionIDType }
     *     
     */
    public MaterialDefinitionIDType getMaterialDefinitionID() {
        return materialDefinitionID;
    }

    /**
     * Sets the value of the materialDefinitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialDefinitionIDType }
     *     
     */
    public void setMaterialDefinitionID(MaterialDefinitionIDType value) {
        this.materialDefinitionID = value;
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
