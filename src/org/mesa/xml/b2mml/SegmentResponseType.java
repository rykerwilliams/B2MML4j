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
 * <p>Java class for SegmentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ProcessSegmentID" type="{http://www.mesa.org/xml/B2MML-V0600}ProcessSegmentIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductSegmentID" type="{http://www.mesa.org/xml/B2MML-V0600}ProductSegmentIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.mesa.org/xml/B2MML-V0600}LocationType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="ActualStartTime" type="{http://www.mesa.org/xml/B2MML-V0600}ActualStartTimeType" minOccurs="0"/>
 *         &lt;element name="ActualEndTime" type="{http://www.mesa.org/xml/B2MML-V0600}ActualEndTimeType" minOccurs="0"/>
 *         &lt;element name="ProductionData" type="{http://www.mesa.org/xml/B2MML-V0600}ProductionDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelActual" type="{http://www.mesa.org/xml/B2MML-V0600}PersonnelActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentActual" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetActual" type="{http://www.mesa.org/xml/B2MML-V0600}PhysicalAssetActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialActual" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialProducedActual" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialProducedActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialConsumedActual" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialConsumedActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConsumableActual" type="{http://www.mesa.org/xml/B2MML-V0600}ConsumableActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentResponse" type="{http://www.mesa.org/xml/B2MML-V0600}SegmentResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponse" type="{http://www.mesa.org/xml/B2MML-V0600}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;element name="SegmentState" type="{http://www.mesa.org/xml/B2MML-V0600}ResponseStateType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}SegmentResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentResponseType", propOrder = {
    "id",
    "processSegmentID",
    "productSegmentID",
    "description",
    "location",
    "hierarchyScope",
    "actualStartTime",
    "actualEndTime",
    "productionData",
    "personnelActual",
    "equipmentActual",
    "physicalAssetActual",
    "materialActual",
    "materialProducedActual",
    "materialConsumedActual",
    "consumableActual",
    "segmentResponse",
    "requiredByRequestedSegmentResponse",
    "segmentState"
})
public class SegmentResponseType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "ProcessSegmentID")
    protected List<ProcessSegmentIDType> processSegmentID;
    @XmlElement(name = "ProductSegmentID")
    protected List<ProductSegmentIDType> productSegmentID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "ActualStartTime")
    protected ActualStartTimeType actualStartTime;
    @XmlElement(name = "ActualEndTime")
    protected ActualEndTimeType actualEndTime;
    @XmlElement(name = "ProductionData")
    protected List<ProductionDataType> productionData;
    @XmlElement(name = "PersonnelActual")
    protected List<PersonnelActualType> personnelActual;
    @XmlElement(name = "EquipmentActual")
    protected List<EquipmentActualType> equipmentActual;
    @XmlElement(name = "PhysicalAssetActual")
    protected List<PhysicalAssetActualType> physicalAssetActual;
    @XmlElement(name = "MaterialActual")
    protected List<MaterialActualType> materialActual;
    @XmlElement(name = "MaterialProducedActual")
    protected List<MaterialProducedActualType> materialProducedActual;
    @XmlElement(name = "MaterialConsumedActual")
    protected List<MaterialConsumedActualType> materialConsumedActual;
    @XmlElement(name = "ConsumableActual")
    protected List<ConsumableActualType> consumableActual;
    @XmlElement(name = "SegmentResponse")
    protected List<SegmentResponseType> segmentResponse;
    @XmlElement(name = "RequiredByRequestedSegmentResponse")
    protected RequiredByRequestedSegmentResponseType requiredByRequestedSegmentResponse;
    @XmlElement(name = "SegmentState")
    protected ResponseStateType segmentState;

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
     * Gets the value of the processSegmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processSegmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessSegmentIDType }
     * 
     * 
     */
    public List<ProcessSegmentIDType> getProcessSegmentID() {
        if (processSegmentID == null) {
            processSegmentID = new ArrayList<ProcessSegmentIDType>();
        }
        return this.processSegmentID;
    }

    /**
     * Gets the value of the productSegmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSegmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSegmentIDType }
     * 
     * 
     */
    public List<ProductSegmentIDType> getProductSegmentID() {
        if (productSegmentID == null) {
            productSegmentID = new ArrayList<ProductSegmentIDType>();
        }
        return this.productSegmentID;
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
     * Gets the value of the actualStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link ActualStartTimeType }
     *     
     */
    public ActualStartTimeType getActualStartTime() {
        return actualStartTime;
    }

    /**
     * Sets the value of the actualStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualStartTimeType }
     *     
     */
    public void setActualStartTime(ActualStartTimeType value) {
        this.actualStartTime = value;
    }

    /**
     * Gets the value of the actualEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link ActualEndTimeType }
     *     
     */
    public ActualEndTimeType getActualEndTime() {
        return actualEndTime;
    }

    /**
     * Sets the value of the actualEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualEndTimeType }
     *     
     */
    public void setActualEndTime(ActualEndTimeType value) {
        this.actualEndTime = value;
    }

    /**
     * Gets the value of the productionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionDataType }
     * 
     * 
     */
    public List<ProductionDataType> getProductionData() {
        if (productionData == null) {
            productionData = new ArrayList<ProductionDataType>();
        }
        return this.productionData;
    }

    /**
     * Gets the value of the personnelActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelActualType }
     * 
     * 
     */
    public List<PersonnelActualType> getPersonnelActual() {
        if (personnelActual == null) {
            personnelActual = new ArrayList<PersonnelActualType>();
        }
        return this.personnelActual;
    }

    /**
     * Gets the value of the equipmentActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentActualType }
     * 
     * 
     */
    public List<EquipmentActualType> getEquipmentActual() {
        if (equipmentActual == null) {
            equipmentActual = new ArrayList<EquipmentActualType>();
        }
        return this.equipmentActual;
    }

    /**
     * Gets the value of the physicalAssetActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetActualType }
     * 
     * 
     */
    public List<PhysicalAssetActualType> getPhysicalAssetActual() {
        if (physicalAssetActual == null) {
            physicalAssetActual = new ArrayList<PhysicalAssetActualType>();
        }
        return this.physicalAssetActual;
    }

    /**
     * Gets the value of the materialActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialActualType }
     * 
     * 
     */
    public List<MaterialActualType> getMaterialActual() {
        if (materialActual == null) {
            materialActual = new ArrayList<MaterialActualType>();
        }
        return this.materialActual;
    }

    /**
     * Gets the value of the materialProducedActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialProducedActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialProducedActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialProducedActualType }
     * 
     * 
     */
    public List<MaterialProducedActualType> getMaterialProducedActual() {
        if (materialProducedActual == null) {
            materialProducedActual = new ArrayList<MaterialProducedActualType>();
        }
        return this.materialProducedActual;
    }

    /**
     * Gets the value of the materialConsumedActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialConsumedActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialConsumedActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialConsumedActualType }
     * 
     * 
     */
    public List<MaterialConsumedActualType> getMaterialConsumedActual() {
        if (materialConsumedActual == null) {
            materialConsumedActual = new ArrayList<MaterialConsumedActualType>();
        }
        return this.materialConsumedActual;
    }

    /**
     * Gets the value of the consumableActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumableActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumableActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumableActualType }
     * 
     * 
     */
    public List<ConsumableActualType> getConsumableActual() {
        if (consumableActual == null) {
            consumableActual = new ArrayList<ConsumableActualType>();
        }
        return this.consumableActual;
    }

    /**
     * Gets the value of the segmentResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentResponseType }
     * 
     * 
     */
    public List<SegmentResponseType> getSegmentResponse() {
        if (segmentResponse == null) {
            segmentResponse = new ArrayList<SegmentResponseType>();
        }
        return this.segmentResponse;
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
     *     {@link ResponseStateType }
     *     
     */
    public ResponseStateType getSegmentState() {
        return segmentState;
    }

    /**
     * Sets the value of the segmentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStateType }
     *     
     */
    public void setSegmentState(ResponseStateType value) {
        this.segmentState = value;
    }

}
