//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.06 at 04:41:19 AM EST 
//


package org.mesa.xml.b2mml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaterialInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.mesa.org/xml/B2MML-V0600}LocationType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML-V0600}PublishedDateType" minOccurs="0"/>
 *         &lt;element name="MaterialClass" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialDefinition" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialLot" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialLotType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSubLot" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialSubLotType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialTestSpecification" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialTestSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}MaterialInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialInformationType", propOrder = {
    "id",
    "description",
    "location",
    "hierarchyScope",
    "publishedDate",
    "materialClass",
    "materialDefinition",
    "materialLot",
    "materialSubLot",
    "materialTestSpecification"
})
public class MaterialInformationType
    implements Serializable
{

    @XmlElementRef(name = "ID", namespace = "http://www.mesa.org/xml/B2MML-V0600", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentifierType> id;
    @XmlElement(name = "Description", nillable = true)
    protected List<DescriptionType> description;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElementRef(name = "HierarchyScope", namespace = "http://www.mesa.org/xml/B2MML-V0600", type = JAXBElement.class, required = false)
    protected JAXBElement<HierarchyScopeType> hierarchyScope;
    @XmlElementRef(name = "PublishedDate", namespace = "http://www.mesa.org/xml/B2MML-V0600", type = JAXBElement.class, required = false)
    protected JAXBElement<PublishedDateType> publishedDate;
    @XmlElement(name = "MaterialClass", nillable = true)
    protected List<MaterialClassType> materialClass;
    @XmlElement(name = "MaterialDefinition", nillable = true)
    protected List<MaterialDefinitionType> materialDefinition;
    @XmlElement(name = "MaterialLot", nillable = true)
    protected List<MaterialLotType> materialLot;
    @XmlElement(name = "MaterialSubLot", nillable = true)
    protected List<MaterialSubLotType> materialSubLot;
    @XmlElement(name = "MaterialTestSpecification", nillable = true)
    protected List<MaterialTestSpecificationType> materialTestSpecification;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     *     
     */
    public JAXBElement<IdentifierType> getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     *     
     */
    public void setID(JAXBElement<IdentifierType> value) {
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
     *     {@link JAXBElement }{@code <}{@link HierarchyScopeType }{@code >}
     *     
     */
    public JAXBElement<HierarchyScopeType> getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * Sets the value of the hierarchyScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HierarchyScopeType }{@code >}
     *     
     */
    public void setHierarchyScope(JAXBElement<HierarchyScopeType> value) {
        this.hierarchyScope = value;
    }

    /**
     * Gets the value of the publishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PublishedDateType }{@code >}
     *     
     */
    public JAXBElement<PublishedDateType> getPublishedDate() {
        return publishedDate;
    }

    /**
     * Sets the value of the publishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PublishedDateType }{@code >}
     *     
     */
    public void setPublishedDate(JAXBElement<PublishedDateType> value) {
        this.publishedDate = value;
    }

    /**
     * Gets the value of the materialClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialClassType }
     * 
     * 
     */
    public List<MaterialClassType> getMaterialClass() {
        if (materialClass == null) {
            materialClass = new ArrayList<MaterialClassType>();
        }
        return this.materialClass;
    }

    /**
     * Gets the value of the materialDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialDefinitionType }
     * 
     * 
     */
    public List<MaterialDefinitionType> getMaterialDefinition() {
        if (materialDefinition == null) {
            materialDefinition = new ArrayList<MaterialDefinitionType>();
        }
        return this.materialDefinition;
    }

    /**
     * Gets the value of the materialLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialLotType }
     * 
     * 
     */
    public List<MaterialLotType> getMaterialLot() {
        if (materialLot == null) {
            materialLot = new ArrayList<MaterialLotType>();
        }
        return this.materialLot;
    }

    /**
     * Gets the value of the materialSubLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSubLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSubLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialSubLotType }
     * 
     * 
     */
    public List<MaterialSubLotType> getMaterialSubLot() {
        if (materialSubLot == null) {
            materialSubLot = new ArrayList<MaterialSubLotType>();
        }
        return this.materialSubLot;
    }

    /**
     * Gets the value of the materialTestSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialTestSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialTestSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialTestSpecificationType }
     * 
     * 
     */
    public List<MaterialTestSpecificationType> getMaterialTestSpecification() {
        if (materialTestSpecification == null) {
            materialTestSpecification = new ArrayList<MaterialTestSpecificationType>();
        }
        return this.materialTestSpecification;
    }

}