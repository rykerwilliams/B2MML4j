//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.06 at 04:41:47 AM EST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonnelCapabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonnelCapabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonnelClassID" type="{http://www.mesa.org/xml/B2MML-V0600}PersonnelClassIDType" minOccurs="0"/>
 *         &lt;element name="PersonID" type="{http://www.mesa.org/xml/B2MML-V0600}PersonIDType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CapabilityType" type="{http://www.mesa.org/xml/B2MML-V0600}CapabilityTypeType"/>
 *         &lt;element name="Reason" type="{http://www.mesa.org/xml/B2MML-V0600}ReasonType" minOccurs="0"/>
 *         &lt;element name="EquipmentElementLevel" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentElementLevelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML-V0600}StartTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML-V0600}EndTimeType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.mesa.org/xml/B2MML-V0600}LocationType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML-V0600}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelCapabilityProperty" type="{http://www.mesa.org/xml/B2MML-V0600}PersonnelCapabilityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}PersonnelCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonnelCapabilityType", propOrder = {
    "personnelClassID",
    "personID",
    "description",
    "capabilityType",
    "reason",
    "equipmentElementLevel",
    "startTime",
    "endTime",
    "location",
    "hierarchyScope",
    "quantity",
    "personnelCapabilityProperty"
})
public class PersonnelCapabilityType {

    @XmlElement(name = "PersonnelClassID")
    protected PersonnelClassIDType personnelClassID;
    @XmlElement(name = "PersonID")
    protected PersonIDType personID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "CapabilityType", required = true)
    protected CapabilityTypeType capabilityType;
    @XmlElement(name = "Reason")
    protected ReasonType reason;
    @XmlElement(name = "EquipmentElementLevel")
    protected List<EquipmentElementLevelType> equipmentElementLevel;
    @XmlElement(name = "StartTime")
    protected StartTimeType startTime;
    @XmlElement(name = "EndTime")
    protected EndTimeType endTime;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "PersonnelCapabilityProperty")
    protected List<PersonnelCapabilityPropertyType> personnelCapabilityProperty;

    /**
     * Gets the value of the personnelClassID property.
     * 
     * @return
     *     possible object is
     *     {@link PersonnelClassIDType }
     *     
     */
    public PersonnelClassIDType getPersonnelClassID() {
        return personnelClassID;
    }

    /**
     * Sets the value of the personnelClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonnelClassIDType }
     *     
     */
    public void setPersonnelClassID(PersonnelClassIDType value) {
        this.personnelClassID = value;
    }

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIDType }
     *     
     */
    public PersonIDType getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIDType }
     *     
     */
    public void setPersonID(PersonIDType value) {
        this.personID = value;
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
     * Gets the value of the capabilityType property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityTypeType }
     *     
     */
    public CapabilityTypeType getCapabilityType() {
        return capabilityType;
    }

    /**
     * Sets the value of the capabilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityTypeType }
     *     
     */
    public void setCapabilityType(CapabilityTypeType value) {
        this.capabilityType = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonType }
     *     
     */
    public ReasonType getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonType }
     *     
     */
    public void setReason(ReasonType value) {
        this.reason = value;
    }

    /**
     * Gets the value of the equipmentElementLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentElementLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentElementLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentElementLevelType }
     * 
     * 
     */
    public List<EquipmentElementLevelType> getEquipmentElementLevel() {
        if (equipmentElementLevel == null) {
            equipmentElementLevel = new ArrayList<EquipmentElementLevelType>();
        }
        return this.equipmentElementLevel;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link StartTimeType }
     *     
     */
    public StartTimeType getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTimeType }
     *     
     */
    public void setStartTime(StartTimeType value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link EndTimeType }
     *     
     */
    public EndTimeType getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTimeType }
     *     
     */
    public void setEndTime(EndTimeType value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the hierarchyScope property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyScopeType }
     *     
     */
    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * Sets the value of the hierarchyScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyScopeType }
     *     
     */
    public void setHierarchyScope(HierarchyScopeType value) {
        this.hierarchyScope = value;
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
     * Gets the value of the personnelCapabilityProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelCapabilityProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelCapabilityProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelCapabilityPropertyType }
     * 
     * 
     */
    public List<PersonnelCapabilityPropertyType> getPersonnelCapabilityProperty() {
        if (personnelCapabilityProperty == null) {
            personnelCapabilityProperty = new ArrayList<PersonnelCapabilityPropertyType>();
        }
        return this.personnelCapabilityProperty;
    }

}
