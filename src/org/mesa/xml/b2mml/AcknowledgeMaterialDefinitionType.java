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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AcknowledgeMaterialDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcknowledgeMaterialDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/B2MML-V0600}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Acknowledge" type="{http://www.mesa.org/xml/B2MML-V0600}TransAcknowledgeType"/>
 *                   &lt;element name="MaterialDefinition" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialDefinitionType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="releaseID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="versionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgeMaterialDefinitionType", propOrder = {
    "applicationArea",
    "dataArea"
})
public class AcknowledgeMaterialDefinitionType
    implements Serializable
{

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected AcknowledgeMaterialDefinitionType.DataArea dataArea;
    @XmlAttribute(name = "releaseID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String releaseID;
    @XmlAttribute(name = "versionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String versionID;

    /**
     * Gets the value of the applicationArea property.
     * 
     * @return
     *     possible object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public TransApplicationAreaType getApplicationArea() {
        return applicationArea;
    }

    /**
     * Sets the value of the applicationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public void setApplicationArea(TransApplicationAreaType value) {
        this.applicationArea = value;
    }

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeMaterialDefinitionType.DataArea }
     *     
     */
    public AcknowledgeMaterialDefinitionType.DataArea getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeMaterialDefinitionType.DataArea }
     *     
     */
    public void setDataArea(AcknowledgeMaterialDefinitionType.DataArea value) {
        this.dataArea = value;
    }

    /**
     * Gets the value of the releaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseID() {
        return releaseID;
    }

    /**
     * Sets the value of the releaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseID(String value) {
        this.releaseID = value;
    }

    /**
     * Gets the value of the versionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionID() {
        return versionID;
    }

    /**
     * Sets the value of the versionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionID(String value) {
        this.versionID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Acknowledge" type="{http://www.mesa.org/xml/B2MML-V0600}TransAcknowledgeType"/>
     *         &lt;element name="MaterialDefinition" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialDefinitionType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acknowledge",
        "materialDefinition"
    })
    public static class DataArea
        implements Serializable
    {

        @XmlElement(name = "Acknowledge", required = true)
        protected TransAcknowledgeType acknowledge;
        @XmlElement(name = "MaterialDefinition", required = true)
        protected List<MaterialDefinitionType> materialDefinition;

        /**
         * Gets the value of the acknowledge property.
         * 
         * @return
         *     possible object is
         *     {@link TransAcknowledgeType }
         *     
         */
        public TransAcknowledgeType getAcknowledge() {
            return acknowledge;
        }

        /**
         * Sets the value of the acknowledge property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransAcknowledgeType }
         *     
         */
        public void setAcknowledge(TransAcknowledgeType value) {
            this.acknowledge = value;
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

    }

}
