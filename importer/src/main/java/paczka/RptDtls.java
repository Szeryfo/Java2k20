
package paczka;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}CtrPtySpcfcData"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}CmonTradData"/>
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
    "ctrPtySpcfcData",
    "cmonTradData"
})
@XmlRootElement(name = "RptDtls", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class RptDtls {

    @XmlElement(name = "CtrPtySpcfcData", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected CtrPtySpcfcData ctrPtySpcfcData;
    @XmlElement(name = "CmonTradData", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected CmonTradData cmonTradData;

    /**
     * Gets the value of the ctrPtySpcfcData property.
     * 
     * @return
     *     possible object is
     *     {@link CtrPtySpcfcData }
     *     
     */
    public CtrPtySpcfcData getCtrPtySpcfcData() {
        return ctrPtySpcfcData;
    }

    /**
     * Sets the value of the ctrPtySpcfcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtrPtySpcfcData }
     *     
     */
    public void setCtrPtySpcfcData(CtrPtySpcfcData value) {
        this.ctrPtySpcfcData = value;
    }

    /**
     * Gets the value of the cmonTradData property.
     * 
     * @return
     *     possible object is
     *     {@link CmonTradData }
     *     
     */
    public CmonTradData getCmonTradData() {
        return cmonTradData;
    }

    /**
     * Sets the value of the cmonTradData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmonTradData }
     *     
     */
    public void setCmonTradData(CmonTradData value) {
        this.cmonTradData = value;
    }

}
