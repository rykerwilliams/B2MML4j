
package org.mesa.xml.b2mml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductionPerformancesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionPerformancesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductionPerformanceRecord" type="{http://www.mesa.org/xml/B2MML-V0600}ProductionPerformanceRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionPerformancesType", propOrder = {
    "productionPerformanceRecord"
})
public class ProductionPerformancesType
    implements Serializable
{

    @XmlElement(name = "ProductionPerformanceRecord")
    protected List<ProductionPerformanceRecordType> productionPerformanceRecord;

    /**
     * Gets the value of the productionPerformanceRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionPerformanceRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionPerformanceRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionPerformanceRecordType }
     * 
     * 
     */
    public List<ProductionPerformanceRecordType> getProductionPerformanceRecord() {
        if (productionPerformanceRecord == null) {
            productionPerformanceRecord = new ArrayList<ProductionPerformanceRecordType>();
        }
        return this.productionPerformanceRecord;
    }

}
