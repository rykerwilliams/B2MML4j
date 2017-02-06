
package org.mesa.xml.b2mml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceQualificationsManifestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceQualificationsManifestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600}BatchProductionRecordEntryType"/>
 *         &lt;element name="RecordReference" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType"/>
 *         &lt;element name="ResourceID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType"/>
 *         &lt;element name="ResourceUse" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType"/>
 *         &lt;element name="ResourceType" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType"/>
 *         &lt;element name="QualificationStatus" type="{http://www.mesa.org/xml/B2MML-V0600}CodeType"/>
 *         &lt;element name="EffectiveTimeStamp" type="{http://www.mesa.org/xml/B2MML-V0600}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ExpirationTimeStamp" type="{http://www.mesa.org/xml/B2MML-V0600}DateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceQualificationsManifestType", propOrder = {
    "entryID",
    "objectType",
    "timeStamp",
    "externalReference",
    "description",
    "recordReference",
    "resourceID",
    "resourceUse",
    "resourceType",
    "qualificationStatus",
    "effectiveTimeStamp",
    "expirationTimeStamp"
})
public class ResourceQualificationsManifestType
    implements Serializable
{

    @XmlElement(name = "EntryID", required = true)
    protected IdentifierType entryID;
    @XmlElement(name = "ObjectType", required = true)
    protected RecordObjectTypeType objectType;
    @XmlElement(name = "TimeStamp")
    protected DateTimeType timeStamp;
    @XmlElement(name = "ExternalReference")
    protected IdentifierType externalReference;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "RecordReference", required = true)
    protected IdentifierType recordReference;
    @XmlElement(name = "ResourceID", required = true)
    protected IdentifierType resourceID;
    @XmlElement(name = "ResourceUse", required = true)
    protected IdentifierType resourceUse;
    @XmlElement(name = "ResourceType", required = true)
    protected IdentifierType resourceType;
    @XmlElement(name = "QualificationStatus", required = true)
    protected CodeType qualificationStatus;
    @XmlElement(name = "EffectiveTimeStamp")
    protected DateTimeType effectiveTimeStamp;
    @XmlElement(name = "ExpirationTimeStamp")
    protected DateTimeType expirationTimeStamp;

    /**
     * Gets the value of the entryID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getEntryID() {
        return entryID;
    }

    /**
     * Sets the value of the entryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setEntryID(IdentifierType value) {
        this.entryID = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordObjectTypeType }
     *     
     */
    public RecordObjectTypeType getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordObjectTypeType }
     *     
     */
    public void setObjectType(RecordObjectTypeType value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setTimeStamp(DateTimeType value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setExternalReference(IdentifierType value) {
        this.externalReference = value;
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
     * Gets the value of the recordReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getRecordReference() {
        return recordReference;
    }

    /**
     * Sets the value of the recordReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setRecordReference(IdentifierType value) {
        this.recordReference = value;
    }

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setResourceID(IdentifierType value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the resourceUse property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getResourceUse() {
        return resourceUse;
    }

    /**
     * Sets the value of the resourceUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setResourceUse(IdentifierType value) {
        this.resourceUse = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setResourceType(IdentifierType value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the qualificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getQualificationStatus() {
        return qualificationStatus;
    }

    /**
     * Sets the value of the qualificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setQualificationStatus(CodeType value) {
        this.qualificationStatus = value;
    }

    /**
     * Gets the value of the effectiveTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveTimeStamp() {
        return effectiveTimeStamp;
    }

    /**
     * Sets the value of the effectiveTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveTimeStamp(DateTimeType value) {
        this.effectiveTimeStamp = value;
    }

    /**
     * Gets the value of the expirationTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getExpirationTimeStamp() {
        return expirationTimeStamp;
    }

    /**
     * Sets the value of the expirationTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setExpirationTimeStamp(DateTimeType value) {
        this.expirationTimeStamp = value;
    }

}
