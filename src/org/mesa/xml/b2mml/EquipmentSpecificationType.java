//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.06 at 04:42:26 AM EST 
//


package org.mesa.xml.b2mml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentClassID" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentClassIDType" minOccurs="0"/>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentIDType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML-V0600}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentSpecificationProperty" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentSpecificationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}EquipmentSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentSpecificationType", propOrder = {
    "equipmentClassID",
    "equipmentID",
    "description",
    "quantity",
    "equipmentSpecificationProperty"
})
public class EquipmentSpecificationType
    implements Serializable
{

    @XmlElement(name = "EquipmentClassID")
    protected EquipmentClassIDType equipmentClassID;
    @XmlElement(name = "EquipmentID")
    protected EquipmentIDType equipmentID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "EquipmentSpecificationProperty")
    protected List<EquipmentSpecificationPropertyType> equipmentSpecificationProperty;

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
     * Gets the value of the equipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentIDType }
     *     
     */
    public EquipmentIDType getEquipmentID() {
        return equipmentID;
    }

    /**
     * Sets the value of the equipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentIDType }
     *     
     */
    public void setEquipmentID(EquipmentIDType value) {
        this.equipmentID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityValueType }
     * 
     * 
     */
    public List<QuantityValueType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<QuantityValueType>();
        }
        return this.quantity;
    }

    /**
     * Gets the value of the equipmentSpecificationProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentSpecificationProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentSpecificationProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentSpecificationPropertyType }
     * 
     * 
     */
    public List<EquipmentSpecificationPropertyType> getEquipmentSpecificationProperty() {
        if (equipmentSpecificationProperty == null) {
            equipmentSpecificationProperty = new ArrayList<EquipmentSpecificationPropertyType>();
        }
        return this.equipmentSpecificationProperty;
    }

}
