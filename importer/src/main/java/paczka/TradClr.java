
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}ClrOblgtn"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Clrd"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}IntraGrp"/>
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
    "clrOblgtn",
    "clrd",
    "intraGrp"
})
@XmlRootElement(name = "TradClr", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class TradClr {

    @XmlElement(name = "ClrOblgtn", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String clrOblgtn;
    @XmlElement(name = "Clrd", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String clrd;
    @XmlElement(name = "IntraGrp", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String intraGrp;

    /**
     * Gets the value of the clrOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrOblgtn() {
        return clrOblgtn;
    }

    /**
     * Sets the value of the clrOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrOblgtn(String value) {
        this.clrOblgtn = value;
    }

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrd(String value) {
        this.clrd = value;
    }

    /**
     * Gets the value of the intraGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraGrp() {
        return intraGrp;
    }

    /**
     * Sets the value of the intraGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraGrp(String value) {
        this.intraGrp = value;
    }

}
