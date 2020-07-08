
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}CtrctData"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}TxData"/>
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
    "ctrctData",
    "txData"
})
@XmlRootElement(name = "CmonTradData", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class CmonTradData {

    @XmlElement(name = "CtrctData", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected CtrctData ctrctData;
    @XmlElement(name = "TxData", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected TxData txData;

    /**
     * Gets the value of the ctrctData property.
     * 
     * @return
     *     possible object is
     *     {@link CtrctData }
     *     
     */
    public CtrctData getCtrctData() {
        return ctrctData;
    }

    /**
     * Sets the value of the ctrctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtrctData }
     *     
     */
    public void setCtrctData(CtrctData value) {
        this.ctrctData = value;
    }

    /**
     * Gets the value of the txData property.
     * 
     * @return
     *     possible object is
     *     {@link TxData }
     *     
     */
    public TxData getTxData() {
        return txData;
    }

    /**
     * Sets the value of the txData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxData }
     *     
     */
    public void setTxData(TxData value) {
        this.txData = value;
    }

}
