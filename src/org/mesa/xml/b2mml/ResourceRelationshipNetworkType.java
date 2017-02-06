//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.06 at 04:41:57 AM EST 
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
 * <p>Java class for ResourceRelationshipNetworkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceRelationshipNetworkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="RelationshipType" type="{http://www.mesa.org/xml/B2MML-V0600}RelationshipTypeType" minOccurs="0"/>
 *         &lt;element name="RelationshipForm" type="{http://www.mesa.org/xml/B2MML-V0600}RelationshipFormType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML-V0600}PublishedDateType" minOccurs="0"/>
 *         &lt;element name="ResourceNetworkConnection" type="{http://www.mesa.org/xml/B2MML-V0600}ResourceNetworkConnectionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}ResourceRelationshipNetwork" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceRelationshipNetworkType", propOrder = {
    "id",
    "description",
    "hierarchyScope",
    "relationshipType",
    "relationshipForm",
    "publishedDate",
    "resourceNetworkConnection"
})
public class ResourceRelationshipNetworkType
    implements Serializable
{

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "RelationshipType")
    protected RelationshipTypeType relationshipType;
    @XmlElement(name = "RelationshipForm")
    protected RelationshipFormType relationshipForm;
    @XmlElement(name = "PublishedDate")
    protected PublishedDateType publishedDate;
    @XmlElement(name = "ResourceNetworkConnection")
    protected List<ResourceNetworkConnectionType> resourceNetworkConnection;

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
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipTypeType }
     *     
     */
    public RelationshipTypeType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipTypeType }
     *     
     */
    public void setRelationshipType(RelationshipTypeType value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the relationshipForm property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipFormType }
     *     
     */
    public RelationshipFormType getRelationshipForm() {
        return relationshipForm;
    }

    /**
     * Sets the value of the relationshipForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipFormType }
     *     
     */
    public void setRelationshipForm(RelationshipFormType value) {
        this.relationshipForm = value;
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
     * Gets the value of the resourceNetworkConnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceNetworkConnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceNetworkConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceNetworkConnectionType }
     * 
     * 
     */
    public List<ResourceNetworkConnectionType> getResourceNetworkConnection() {
        if (resourceNetworkConnection == null) {
            resourceNetworkConnection = new ArrayList<ResourceNetworkConnectionType>();
        }
        return this.resourceNetworkConnection;
    }

}
