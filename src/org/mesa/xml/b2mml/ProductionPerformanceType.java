//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.28 at 02:10:24 PM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductionPerformanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionPerformanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.mesa.org/xml/B2MML-V0600}LocationType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML-V0600}PublishedDateType" minOccurs="0"/>
 *         &lt;element name="ProductionScheduleID" type="{http://www.mesa.org/xml/B2MML-V0600}ProductionScheduleIDType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML-V0600}StartTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML-V0600}EndTimeType" minOccurs="0"/>
 *         &lt;element name="EquipmentElementLevel" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentElementLevelType" minOccurs="0"/>
 *         &lt;element name="ProductionResponse" type="{http://www.mesa.org/xml/B2MML-V0600}ProductionResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PerformanceState" type="{http://www.mesa.org/xml/B2MML-V0600}ResponseStateType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}ProductionPerformance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionPerformanceType", propOrder = {
    "id",
    "description",
    "location",
    "hierarchyScope",
    "publishedDate",
    "productionScheduleID",
    "startTime",
    "endTime",
    "equipmentElementLevel",
    "productionResponse",
    "performanceState"
})
public class ProductionPerformanceType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "PublishedDate")
    protected PublishedDateType publishedDate;
    @XmlElement(name = "ProductionScheduleID")
    protected ProductionScheduleIDType productionScheduleID;
    @XmlElement(name = "StartTime")
    protected StartTimeType startTime;
    @XmlElement(name = "EndTime")
    protected EndTimeType endTime;
    @XmlElement(name = "EquipmentElementLevel")
    protected EquipmentElementLevelType equipmentElementLevel;
    @XmlElement(name = "ProductionResponse")
    protected List<ProductionResponseType> productionResponse;
    @XmlElement(name = "PerformanceState")
    protected ResponseStateType performanceState;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setID(IdentifierType value) {
        this.id = value;
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
     * Gets the value of the publishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link PublishedDateType }
     *     
     */
    public PublishedDateType getPublishedDate() {
        return publishedDate;
    }

    /**
     * Sets the value of the publishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishedDateType }
     *     
     */
    public void setPublishedDate(PublishedDateType value) {
        this.publishedDate = value;
    }

    /**
     * Gets the value of the productionScheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionScheduleIDType }
     *     
     */
    public ProductionScheduleIDType getProductionScheduleID() {
        return productionScheduleID;
    }

    /**
     * Sets the value of the productionScheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionScheduleIDType }
     *     
     */
    public void setProductionScheduleID(ProductionScheduleIDType value) {
        this.productionScheduleID = value;
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
     * Gets the value of the equipmentElementLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentElementLevelType }
     *     
     */
    public EquipmentElementLevelType getEquipmentElementLevel() {
        return equipmentElementLevel;
    }

    /**
     * Sets the value of the equipmentElementLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentElementLevelType }
     *     
     */
    public void setEquipmentElementLevel(EquipmentElementLevelType value) {
        this.equipmentElementLevel = value;
    }

    /**
     * Gets the value of the productionResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionResponseType }
     * 
     * 
     */
    public List<ProductionResponseType> getProductionResponse() {
        if (productionResponse == null) {
            productionResponse = new ArrayList<ProductionResponseType>();
        }
        return this.productionResponse;
    }

    /**
     * Gets the value of the performanceState property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStateType }
     *     
     */
    public ResponseStateType getPerformanceState() {
        return performanceState;
    }

    /**
     * Sets the value of the performanceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStateType }
     *     
     */
    public void setPerformanceState(ResponseStateType value) {
        this.performanceState = value;
    }

}
