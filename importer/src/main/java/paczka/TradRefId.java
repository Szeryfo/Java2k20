
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}UnqTradIdr"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}RptgCtrPtyId"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}OthrCtrPtyId"/>
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
    "unqTradIdr",
    "rptgCtrPtyId",
    "othrCtrPtyId"
})
@XmlRootElement(name = "TradRefId", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class TradRefId {

    @XmlElement(name = "UnqTradIdr", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String unqTradIdr;
    @XmlElement(name = "RptgCtrPtyId", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String rptgCtrPtyId;
    @XmlElement(name = "OthrCtrPtyId", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String othrCtrPtyId;

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqTradIdr(String value) {
        this.unqTradIdr = value;
    }

    /**
     * Gets the value of the rptgCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptgCtrPtyId() {
        return rptgCtrPtyId;
    }

    /**
     * Sets the value of the rptgCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptgCtrPtyId(String value) {
        this.rptgCtrPtyId = value;
    }

    /**
     * Gets the value of the othrCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrCtrPtyId() {
        return othrCtrPtyId;
    }

    /**
     * Sets the value of the othrCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrCtrPtyId(String value) {
        this.othrCtrPtyId = value;
    }

}
