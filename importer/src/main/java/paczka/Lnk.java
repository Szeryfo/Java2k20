
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}PrvsSndrMsgRef"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}TradRefId"/>
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
    "prvsSndrMsgRef",
    "tradRefId"
})
@XmlRootElement(name = "Lnk", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class Lnk {

    @XmlElement(name = "PrvsSndrMsgRef", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String prvsSndrMsgRef;
    @XmlElement(name = "TradRefId", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected TradRefId tradRefId;

    /**
     * Gets the value of the prvsSndrMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsSndrMsgRef() {
        return prvsSndrMsgRef;
    }

    /**
     * Sets the value of the prvsSndrMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvsSndrMsgRef(String value) {
        this.prvsSndrMsgRef = value;
    }

    /**
     * Gets the value of the tradRefId property.
     * 
     * @return
     *     possible object is
     *     {@link TradRefId }
     *     
     */
    public TradRefId getTradRefId() {
        return tradRefId;
    }

    /**
     * Sets the value of the tradRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradRefId }
     *     
     */
    public void setTradRefId(TradRefId value) {
        this.tradRefId = value;
    }

}
