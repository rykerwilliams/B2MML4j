//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.06 at 04:41:35 AM EST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualificationTestSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualificationTestSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML-V0600}VersionType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.mesa.org/xml/B2MML-V0600}LocationType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="TestedPersonProperty" type="{http://www.mesa.org/xml/B2MML-V0600}TestedPersonPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestedPersonnelClassProperty" type="{http://www.mesa.org/xml/B2MML-V0600}TestedPersonnelClassPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}QualificationTestSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationTestSpecificationType", propOrder = {
    "id",
    "description",
    "version",
    "location",
    "hierarchyScope",
    "testedPersonProperty",
    "testedPersonnelClassProperty"
})
public class QualificationTestSpecificationType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Version")
    protected VersionType version;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "TestedPersonProperty")
    protected List<TestedPersonPropertyType> testedPersonProperty;
    @XmlElement(name = "TestedPersonnelClassProperty")
    protected List<TestedPersonnelClassPropertyType> testedPersonnelClassProperty;

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
     * Gets the value of the testedPersonProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testedPersonProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestedPersonProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestedPersonPropertyType }
     * 
     * 
     */
    public List<TestedPersonPropertyType> getTestedPersonProperty() {
        if (testedPersonProperty == null) {
            testedPersonProperty = new ArrayList<TestedPersonPropertyType>();
        }
        return this.testedPersonProperty;
    }

    /**
     * Gets the value of the testedPersonnelClassProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testedPersonnelClassProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestedPersonnelClassProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestedPersonnelClassPropertyType }
     * 
     * 
     */
    public List<TestedPersonnelClassPropertyType> getTestedPersonnelClassProperty() {
        if (testedPersonnelClassProperty == null) {
            testedPersonnelClassProperty = new ArrayList<TestedPersonnelClassPropertyType>();
        }
        return this.testedPersonnelClassProperty;
    }

}