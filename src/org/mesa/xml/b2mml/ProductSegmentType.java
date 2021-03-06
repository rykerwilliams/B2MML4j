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
 * <p>Java class for ProductSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.mesa.org/xml/B2MML-V0600}DurationType" minOccurs="0"/>
 *         &lt;element name="ProcessSegmentID" type="{http://www.mesa.org/xml/B2MML-V0600}ProcessSegmentIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Parameter" type="{http://www.mesa.org/xml/B2MML-V0600}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelSpecification" type="{http://www.mesa.org/xml/B2MML-V0600}PersonnelSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentSpecification" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetSpecification" type="{http://www.mesa.org/xml/B2MML-V0600}PhysicalAssetSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSpecification" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentDependency" type="{http://www.mesa.org/xml/B2MML-V0600}SegmentDependencyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductSegment" type="{http://www.mesa.org/xml/B2MML-V0600}ProductSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}ProductSegment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSegmentType", propOrder = {
    "id",
    "description",
    "duration",
    "processSegmentID",
    "parameter",
    "personnelSpecification",
    "equipmentSpecification",
    "physicalAssetSpecification",
    "materialSpecification",
    "segmentDependency",
    "productSegment"
})
public class ProductSegmentType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected DescriptionType description;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "ProcessSegmentID")
    protected List<ProcessSegmentIDType> processSegmentID;
    @XmlElement(name = "Parameter")
    protected List<ParameterType> parameter;
    @XmlElement(name = "PersonnelSpecification")
    protected List<PersonnelSpecificationType> personnelSpecification;
    @XmlElement(name = "EquipmentSpecification")
    protected List<EquipmentSpecificationType> equipmentSpecification;
    @XmlElement(name = "PhysicalAssetSpecification")
    protected List<PhysicalAssetSpecificationType> physicalAssetSpecification;
    @XmlElement(name = "MaterialSpecification")
    protected List<MaterialSpecificationType> materialSpecification;
    @XmlElement(name = "SegmentDependency")
    protected List<SegmentDependencyType> segmentDependency;
    @XmlElement(name = "ProductSegment")
    protected List<ProductSegmentType> productSegment;

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
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
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
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterType }
     * 
     * 
     */
    public List<ParameterType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ParameterType>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the personnelSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelSpecificationType }
     * 
     * 
     */
    public List<PersonnelSpecificationType> getPersonnelSpecification() {
        if (personnelSpecification == null) {
            personnelSpecification = new ArrayList<PersonnelSpecificationType>();
        }
        return this.personnelSpecification;
    }

    /**
     * Gets the value of the equipmentSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentSpecificationType }
     * 
     * 
     */
    public List<EquipmentSpecificationType> getEquipmentSpecification() {
        if (equipmentSpecification == null) {
            equipmentSpecification = new ArrayList<EquipmentSpecificationType>();
        }
        return this.equipmentSpecification;
    }

    /**
     * Gets the value of the physicalAssetSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetSpecificationType }
     * 
     * 
     */
    public List<PhysicalAssetSpecificationType> getPhysicalAssetSpecification() {
        if (physicalAssetSpecification == null) {
            physicalAssetSpecification = new ArrayList<PhysicalAssetSpecificationType>();
        }
        return this.physicalAssetSpecification;
    }

    /**
     * Gets the value of the materialSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialSpecificationType }
     * 
     * 
     */
    public List<MaterialSpecificationType> getMaterialSpecification() {
        if (materialSpecification == null) {
            materialSpecification = new ArrayList<MaterialSpecificationType>();
        }
        return this.materialSpecification;
    }

    /**
     * Gets the value of the segmentDependency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentDependency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentDependency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentDependencyType }
     * 
     * 
     */
    public List<SegmentDependencyType> getSegmentDependency() {
        if (segmentDependency == null) {
            segmentDependency = new ArrayList<SegmentDependencyType>();
        }
        return this.segmentDependency;
    }

    /**
     * Gets the value of the productSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSegmentType }
     * 
     * 
     */
    public List<ProductSegmentType> getProductSegment() {
        if (productSegment == null) {
            productSegment = new ArrayList<ProductSegmentType>();
        }
        return this.productSegment;
    }

}
