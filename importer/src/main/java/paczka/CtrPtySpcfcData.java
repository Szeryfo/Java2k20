
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}CtrPty"/>
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
    "ctrPty"
})
@XmlRootElement(name = "CtrPtySpcfcData", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class CtrPtySpcfcData {

    @XmlElement(name = "CtrPty", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected CtrPty ctrPty;

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CtrPty }
     *     
     */
    public CtrPty getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtrPty }
     *     
     */
    public void setCtrPty(CtrPty value) {
        this.ctrPty = value;
    }

}
