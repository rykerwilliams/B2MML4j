
package org.mesa.xml.b2mml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationsSchedulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationsSchedulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationsScheduleRecord" type="{http://www.mesa.org/xml/B2MML-V0600}OperationsScheduleRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsSchedulesType", propOrder = {
    "operationsScheduleRecord"
})
public class OperationsSchedulesType
    implements Serializable
{

    @XmlElement(name = "OperationsScheduleRecord")
    protected List<OperationsScheduleRecordType> operationsScheduleRecord;

    /**
     * Gets the value of the operationsScheduleRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsScheduleRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsScheduleRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsScheduleRecordType }
     * 
     * 
     */
    public List<OperationsScheduleRecordType> getOperationsScheduleRecord() {
        if (operationsScheduleRecord == null) {
            operationsScheduleRecord = new ArrayList<OperationsScheduleRecordType>();
        }
        return this.operationsScheduleRecord;
    }

}
