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
import javax.xml.datatype.Duration;


/**
 * <p>Java class for SegmentRequirementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentRequirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ProductSegmentID" type="{http://www.mesa.org/xml/B2MML-V0600}ProductSegmentIDType" minOccurs="0"/>
 *         &lt;element name="ProcessSegmentID" type="{http://www.mesa.org/xml/B2MML-V0600}ProcessSegmentIDType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.mesa.org/xml/B2MML-V0600}LocationType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="EarliestStartTime" type="{http://www.mesa.org/xml/B2MML-V0600}EarliestStartTimeType" minOccurs="0"/>
 *         &lt;element name="LatestEndTime" type="{http://www.mesa.org/xml/B2MML-V0600}LatestEndTimeType" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.mesa.org/xml/B2MML-V0600}DurationType" minOccurs="0"/>
 *         &lt;element name="ProductionParameter" type="{http://www.mesa.org/xml/B2MML-V0600}ProductionParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelRequirement" type="{http://www.mesa.org/xml/B2MML-V0600}PersonnelRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentRequirement" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetRequirement" type="{http://www.mesa.org/xml/B2MML-V0600}PhysicalAssetRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialRequirement" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialProducedRequirement" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialProducedRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialConsumedRequirement" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialConsumedRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConsumableExpectedRequirement" type="{http://www.mesa.org/xml/B2MML-V0600}ConsumableExpectedRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentRequirement" type="{http://www.mesa.org/xml/B2MML-V0600}SegmentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponse" type="{http://www.mesa.org/xml/B2MML-V0600}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;element name="SegmentState" type="{http://www.mesa.org/xml/B2MML-V0600}RequestStateType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}SegmentRequirement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentRequirementType", propOrder = {
    "id",
    "productSegmentID",
    "processSegmentID",
    "description",
    "location",
    "hierarchyScope",
    "earliestStartTime",
    "latestEndTime",
    "duration",
    "productionParameter",
    "personnelRequirement",
    "equipmentRequirement",
    "physicalAssetRequirement",
    "materialRequirement",
    "materialProducedRequirement",
    "materialConsumedRequirement",
    "consumableExpectedRequirement",
    "segmentRequirement",
    "requiredByRequestedSegmentResponse",
    "segmentState"
})
public class SegmentRequirementType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "ProductSegmentID")
    protected ProductSegmentIDType productSegmentID;
    @XmlElement(name = "ProcessSegmentID")
    protected ProcessSegmentIDType processSegmentID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "EarliestStartTime")
    protected EarliestStartTimeType earliestStartTime;
    @XmlElement(name = "LatestEndTime")
    protected LatestEndTimeType latestEndTime;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "ProductionParameter")
    protected List<ProductionParameterType> productionParameter;
    @XmlElement(name = "PersonnelRequirement")
    protected List<PersonnelRequirementType> personnelRequirement;
    @XmlElement(name = "EquipmentRequirement")
    protected List<EquipmentRequirementType> equipmentRequirement;
    @XmlElement(name = "PhysicalAssetRequirement")
    protected List<PhysicalAssetRequirementType> physicalAssetRequirement;
    @XmlElement(name = "MaterialRequirement")
    protected List<MaterialRequirementType> materialRequirement;
    @XmlElement(name = "MaterialProducedRequirement")
    protected List<MaterialProducedRequirementType> materialProducedRequirement;
    @XmlElement(name = "MaterialConsumedRequirement")
    protected List<MaterialConsumedRequirementType> materialConsumedRequirement;
    @XmlElement(name = "ConsumableExpectedRequirement")
    protected List<ConsumableExpectedRequirementType> consumableExpectedRequirement;
    @XmlElement(name = "SegmentRequirement")
    protected List<SegmentRequirementType> segmentRequirement;
    @XmlElement(name = "RequiredByRequestedSegmentResponse")
    protected RequiredByRequestedSegmentResponseType requiredByRequestedSegmentResponse;
    @XmlElement(name = "SegmentState")
    protected RequestStateType segmentState;

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
     * Gets the value of the productSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSegmentIDType }
     *     
     */
    public ProductSegmentIDType getProductSegmentID() {
        return productSegmentID;
    }

    /**
     * Sets the value of the productSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSegmentIDType }
     *     
     */
    public void setProductSegmentID(ProductSegmentIDType value) {
        this.productSegmentID = value;
    }

    /**
     * Gets the value of the processSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessSegmentIDType }
     *     
     */
    public ProcessSegmentIDType getProcessSegmentID() {
        return processSegmentID;
    }

    /**
     * Sets the value of the processSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessSegmentIDType }
     *     
     */
    public void setProcessSegmentID(ProcessSegmentIDType value) {
        this.processSegmentID = value;
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
     * Gets the value of the earliestStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link EarliestStartTimeType }
     *     
     */
    public EarliestStartTimeType getEarliestStartTime() {
        return earliestStartTime;
    }

    /**
     * Sets the value of the earliestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarliestStartTimeType }
     *     
     */
    public void setEarliestStartTime(EarliestStartTimeType value) {
        this.earliestStartTime = value;
    }

    /**
     * Gets the value of the latestEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link LatestEndTimeType }
     *     
     */
    public LatestEndTimeType getLatestEndTime() {
        return latestEndTime;
    }

    /**
     * Sets the value of the latestEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestEndTimeType }
     *     
     */
    public void setLatestEndTime(LatestEndTimeType value) {
        this.latestEndTime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the productionParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionParameterType }
     * 
     * 
     */
    public List<ProductionParameterType> getProductionParameter() {
        if (productionParameter == null) {
            productionParameter = new ArrayList<ProductionParameterType>();
        }
        return this.productionParameter;
    }

    /**
     * Gets the value of the personnelRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelRequirementType }
     * 
     * 
     */
    public List<PersonnelRequirementType> getPersonnelRequirement() {
        if (personnelRequirement == null) {
            personnelRequirement = new ArrayList<PersonnelRequirementType>();
        }
        return this.personnelRequirement;
    }

    /**
     * Gets the value of the equipmentRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentRequirementType }
     * 
     * 
     */
    public List<EquipmentRequirementType> getEquipmentRequirement() {
        if (equipmentRequirement == null) {
            equipmentRequirement = new ArrayList<EquipmentRequirementType>();
        }
        return this.equipmentRequirement;
    }

    /**
     * Gets the value of the physicalAssetRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetRequirementType }
     * 
     * 
     */
    public List<PhysicalAssetRequirementType> getPhysicalAssetRequirement() {
        if (physicalAssetRequirement == null) {
            physicalAssetRequirement = new ArrayList<PhysicalAssetRequirementType>();
        }
        return this.physicalAssetRequirement;
    }

    /**
     * Gets the value of the materialRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialRequirementType }
     * 
     * 
     */
    public List<MaterialRequirementType> getMaterialRequirement() {
        if (materialRequirement == null) {
            materialRequirement = new ArrayList<MaterialRequirementType>();
        }
        return this.materialRequirement;
    }

    /**
     * Gets the value of the materialProducedRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialProducedRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialProducedRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialProducedRequirementType }
     * 
     * 
     */
    public List<MaterialProducedRequirementType> getMaterialProducedRequirement() {
        if (materialProducedRequirement == null) {
            materialProducedRequirement = new ArrayList<MaterialProducedRequirementType>();
        }
        return this.materialProducedRequirement;
    }

    /**
     * Gets the value of the materialConsumedRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialConsumedRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialConsumedRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialConsumedRequirementType }
     * 
     * 
     */
    public List<MaterialConsumedRequirementType> getMaterialConsumedRequirement() {
        if (materialConsumedRequirement == null) {
            materialConsumedRequirement = new ArrayList<MaterialConsumedRequirementType>();
        }
        return this.materialConsumedRequirement;
    }

    /**
     * Gets the value of the consumableExpectedRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumableExpectedRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumableExpectedRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumableExpectedRequirementType }
     * 
     * 
     */
    public List<ConsumableExpectedRequirementType> getConsumableExpectedRequirement() {
        if (consumableExpectedRequirement == null) {
            consumableExpectedRequirement = new ArrayList<ConsumableExpectedRequirementType>();
        }
        return this.consumableExpectedRequirement;
    }

    /**
     * Gets the value of the segmentRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentRequirementType }
     * 
     * 
     */
    public List<SegmentRequirementType> getSegmentRequirement() {
        if (segmentRequirement == null) {
            segmentRequirement = new ArrayList<SegmentRequirementType>();
        }
        return this.segmentRequirement;
    }

    /**
     * Gets the value of the requiredByRequestedSegmentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredByRequestedSegmentResponseType }
     *     
     */
    public RequiredByRequestedSegmentResponseType getRequiredByRequestedSegmentResponse() {
        return requiredByRequestedSegmentResponse;
    }

    /**
     * Sets the value of the requiredByRequestedSegmentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredByRequestedSegmentResponseType }
     *     
     */
    public void setRequiredByRequestedSegmentResponse(RequiredByRequestedSegmentResponseType value) {
        this.requiredByRequestedSegmentResponse = value;
    }

    /**
     * Gets the value of the segmentState property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStateType }
     *     
     */
    public RequestStateType getSegmentState() {
        return segmentState;
    }

    /**
     * Sets the value of the segmentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStateType }
     *     
     */
    public void setSegmentState(RequestStateType value) {
        this.segmentState = value;
    }

}