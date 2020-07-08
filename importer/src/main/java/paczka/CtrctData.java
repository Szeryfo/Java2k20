
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}CtrctTp"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}AsstClss"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}CtrctDtls"/>
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
    "ctrctTp",
    "asstClss",
    "ctrctDtls"
})
@XmlRootElement(name = "CtrctData", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class CtrctData {

    @XmlElement(name = "CtrctTp", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String ctrctTp;
    @XmlElement(name = "AsstClss", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String asstClss;
    @XmlElement(name = "CtrctDtls", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected CtrctDtls ctrctDtls;

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrctTp(String value) {
        this.ctrctTp = value;
    }

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsstClss(String value) {
        this.asstClss = value;
    }

    /**
     * Gets the value of the ctrctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CtrctDtls }
     *     
     */
    public CtrctDtls getCtrctDtls() {
        return ctrctDtls;
    }

    /**
     * Sets the value of the ctrctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtrctDtls }
     *     
     */
    public void setCtrctDtls(CtrctDtls value) {
        this.ctrctDtls = value;
    }

}
