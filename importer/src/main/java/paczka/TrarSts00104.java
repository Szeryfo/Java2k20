
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}GnlInf"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Sts"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}RptDtls"/>
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
    "gnlInf",
    "sts",
    "rptDtls"
})
@XmlRootElement(name = "trar.sts.001.04", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class TrarSts00104 {

    @XmlElement(name = "GnlInf", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected GnlInf gnlInf;
    @XmlElement(name = "Sts", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected Sts sts;
    @XmlElement(name = "RptDtls", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected RptDtls rptDtls;

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link GnlInf }
     *     
     */
    public GnlInf getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnlInf }
     *     
     */
    public void setGnlInf(GnlInf value) {
        this.gnlInf = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Sts }
     *     
     */
    public Sts getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sts }
     *     
     */
    public void setSts(Sts value) {
        this.sts = value;
    }

    /**
     * Gets the value of the rptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RptDtls }
     *     
     */
    public RptDtls getRptDtls() {
        return rptDtls;
    }

    /**
     * Sets the value of the rptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RptDtls }
     *     
     */
    public void setRptDtls(RptDtls value) {
        this.rptDtls = value;
    }

}
