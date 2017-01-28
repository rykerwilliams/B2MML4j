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
 * <p>Java class for OperationsDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationsDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML-V0600}VersionType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="OperationsType" type="{http://www.mesa.org/xml/B2MML-V0600}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML-V0600}PublishedDateType" minOccurs="0"/>
 *         &lt;element name="BillOfMaterialsID" type="{http://www.mesa.org/xml/B2MML-V0600}BillOfMaterialsIDType" minOccurs="0"/>
 *         &lt;element name="WorkDefinitionID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="BillOfResourcesID" type="{http://www.mesa.org/xml/B2MML-V0600}BillOfResourcesIDType" minOccurs="0"/>
 *         &lt;element name="OperationsMaterialBill" type="{http://www.mesa.org/xml/B2MML-V0600}OperationsMaterialBillType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsSegment" type="{http://www.mesa.org/xml/B2MML-V0600}OperationsSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}OperationsDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsDefinitionType", propOrder = {
    "id",
    "version",
    "description",
    "hierarchyScope",
    "operationsType",
    "publishedDate",
    "billOfMaterialsID",
    "workDefinitionID",
    "billOfResourcesID",
    "operationsMaterialBill",
    "operationsSegment"
})
public class OperationsDefinitionType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Version")
    protected VersionType version;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "OperationsType")
    protected OperationsTypeType operationsType;
    @XmlElement(name = "PublishedDate")
    protected PublishedDateType publishedDate;
    @XmlElement(name = "BillOfMaterialsID")
    protected BillOfMaterialsIDType billOfMaterialsID;
    @XmlElement(name = "WorkDefinitionID")
    protected IdentifierType workDefinitionID;
    @XmlElement(name = "BillOfResourcesID")
    protected BillOfResourcesIDType billOfResourcesID;
    @XmlElement(name = "OperationsMaterialBill")
    protected List<OperationsMaterialBillType> operationsMaterialBill;
    @XmlElement(name = "OperationsSegment")
    protected List<OperationsSegmentType> operationsSegment;

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link VersionType }
     *     
     */
    public VersionType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionType }
     *     
     */
    public void setVersion(VersionType value) {
        this.version = value;
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
     * Gets the value of the operationsType property.
     * 
     * @return
     *     possible object is
     *     {@link OperationsTypeType }
     *     
     */
    public OperationsTypeType getOperationsType() {
        return operationsType;
    }

    /**
     * Sets the value of the operationsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationsTypeType }
     *     
     */
    public void setOperationsType(OperationsTypeType value) {
        this.operationsType = value;
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
     * Gets the value of the billOfMaterialsID property.
     * 
     * @return
     *     possible object is
     *     {@link BillOfMaterialsIDType }
     *     
     */
    public BillOfMaterialsIDType getBillOfMaterialsID() {
        return billOfMaterialsID;
    }

    /**
     * Sets the value of the billOfMaterialsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillOfMaterialsIDType }
     *     
     */
    public void setBillOfMaterialsID(BillOfMaterialsIDType value) {
        this.billOfMaterialsID = value;
    }

    /**
     * Gets the value of the workDefinitionID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getWorkDefinitionID() {
        return workDefinitionID;
    }

    /**
     * Sets the value of the workDefinitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setWorkDefinitionID(IdentifierType value) {
        this.workDefinitionID = value;
    }

    /**
     * Gets the value of the billOfResourcesID property.
     * 
     * @return
     *     possible object is
     *     {@link BillOfResourcesIDType }
     *     
     */
    public BillOfResourcesIDType getBillOfResourcesID() {
        return billOfResourcesID;
    }

    /**
     * Sets the value of the billOfResourcesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillOfResourcesIDType }
     *     
     */
    public void setBillOfResourcesID(BillOfResourcesIDType value) {
        this.billOfResourcesID = value;
    }

    /**
     * Gets the value of the operationsMaterialBill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsMaterialBill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsMaterialBill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsMaterialBillType }
     * 
     * 
     */
    public List<OperationsMaterialBillType> getOperationsMaterialBill() {
        if (operationsMaterialBill == null) {
            operationsMaterialBill = new ArrayList<OperationsMaterialBillType>();
        }
        return this.operationsMaterialBill;
    }

    /**
     * Gets the value of the operationsSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsSegmentType }
     * 
     * 
     */
    public List<OperationsSegmentType> getOperationsSegment() {
        if (operationsSegment == null) {
            operationsSegment = new ArrayList<OperationsSegmentType>();
        }
        return this.operationsSegment;
    }

}