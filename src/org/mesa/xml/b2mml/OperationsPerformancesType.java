
package org.mesa.xml.b2mml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationsPerformancesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationsPerformancesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationsPerformanceRecord" type="{http://www.mesa.org/xml/B2MML-V0600}OperationsPerformanceRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsPerformancesType", propOrder = {
    "operationsPerformanceRecord"
})
public class OperationsPerformancesType
    implements Serializable
{

    @XmlElement(name = "OperationsPerformanceRecord")
    protected List<OperationsPerformanceRecordType> operationsPerformanceRecord;

    /**
     * Gets the value of the operationsPerformanceRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsPerformanceRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsPerformanceRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsPerformanceRecordType }
     * 
     * 
     */
    public List<OperationsPerformanceRecordType> getOperationsPerformanceRecord() {
        if (operationsPerformanceRecord == null) {
            operationsPerformanceRecord = new ArrayList<OperationsPerformanceRecordType>();
        }
        return this.operationsPerformanceRecord;
    }

}
