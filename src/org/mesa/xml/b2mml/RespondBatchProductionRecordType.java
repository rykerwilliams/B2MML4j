
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
 * <p>Java class for RespondBatchProductionRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondBatchProductionRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/B2MML-V0600}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Respond" type="{http://www.mesa.org/xml/B2MML-V0600}TransRespondType"/>
 *                   &lt;element name="BatchProductionRecord" type="{http://www.mesa.org/xml/B2MML-V0600}BatchProductionRecordType" maxOccurs="unbounded"/>
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
@XmlType(name = "RespondBatchProductionRecordType", propOrder = {
    "applicationArea",
    "dataArea"
})
public class RespondBatchProductionRecordType
    implements Serializable
{

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected RespondBatchProductionRecordType.DataArea dataArea;
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
     *     {@link RespondBatchProductionRecordType.DataArea }
     *     
     */
    public RespondBatchProductionRecordType.DataArea getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondBatchProductionRecordType.DataArea }
     *     
     */
    public void setDataArea(RespondBatchProductionRecordType.DataArea value) {
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
     *         &lt;element name="Respond" type="{http://www.mesa.org/xml/B2MML-V0600}TransRespondType"/>
     *         &lt;element name="BatchProductionRecord" type="{http://www.mesa.org/xml/B2MML-V0600}BatchProductionRecordType" maxOccurs="unbounded"/>
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
        "respond",
        "batchProductionRecord"
    })
    public static class DataArea
        implements Serializable
    {

        @XmlElement(name = "Respond", required = true)
        protected TransRespondType respond;
        @XmlElement(name = "BatchProductionRecord", required = true)
        protected List<BatchProductionRecordType> batchProductionRecord;

        /**
         * Gets the value of the respond property.
         * 
         * @return
         *     possible object is
         *     {@link TransRespondType }
         *     
         */
        public TransRespondType getRespond() {
            return respond;
        }

        /**
         * Sets the value of the respond property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransRespondType }
         *     
         */
        public void setRespond(TransRespondType value) {
            this.respond = value;
        }

        /**
         * Gets the value of the batchProductionRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the batchProductionRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBatchProductionRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchProductionRecordType }
         * 
         * 
         */
        public List<BatchProductionRecordType> getBatchProductionRecord() {
            if (batchProductionRecord == null) {
                batchProductionRecord = new ArrayList<BatchProductionRecordType>();
            }
            return this.batchProductionRecord;
        }

    }

}
