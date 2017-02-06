
package org.mesa.xml.b2mml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderedDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderIndex" type="{http://www.mesa.org/xml/B2MML-V0600}NumericType" minOccurs="0"/>
 *         &lt;element name="TimeValue" type="{http://www.mesa.org/xml/B2MML-V0600}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DataValue" type="{http://www.mesa.org/xml/B2MML-V0600}DataValueType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderedDataType", propOrder = {
    "orderIndex",
    "timeValue",
    "dataValue"
})
public class OrderedDataType
    implements Serializable
{

    @XmlElement(name = "OrderIndex")
    protected NumericType orderIndex;
    @XmlElement(name = "TimeValue")
    protected DateTimeType timeValue;
    @XmlElement(name = "DataValue", required = true)
    protected List<DataValueType> dataValue;

    /**
     * Gets the value of the orderIndex property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getOrderIndex() {
        return orderIndex;
    }

    /**
     * Sets the value of the orderIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setOrderIndex(NumericType value) {
        this.orderIndex = value;
    }

    /**
     * Gets the value of the timeValue property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getTimeValue() {
        return timeValue;
    }

    /**
     * Sets the value of the timeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setTimeValue(DateTimeType value) {
        this.timeValue = value;
    }

    /**
     * Gets the value of the dataValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataValueType }
     * 
     * 
     */
    public List<DataValueType> getDataValue() {
        if (dataValue == null) {
            dataValue = new ArrayList<DataValueType>();
        }
        return this.dataValue;
    }

}
