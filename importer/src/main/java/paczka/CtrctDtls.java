
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}PdctClssfctn"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}NtnlCcyFrstLeg"/>
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
    "pdctClssfctn",
    "ntnlCcyFrstLeg"
})
@XmlRootElement(name = "CtrctDtls", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class CtrctDtls {

    @XmlElement(name = "PdctClssfctn", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected PdctClssfctn pdctClssfctn;
    @XmlElement(name = "NtnlCcyFrstLeg", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String ntnlCcyFrstLeg;

    /**
     * Gets the value of the pdctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link PdctClssfctn }
     *     
     */
    public PdctClssfctn getPdctClssfctn() {
        return pdctClssfctn;
    }

    /**
     * Sets the value of the pdctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdctClssfctn }
     *     
     */
    public void setPdctClssfctn(PdctClssfctn value) {
        this.pdctClssfctn = value;
    }

    /**
     * Gets the value of the ntnlCcyFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcyFrstLeg() {
        return ntnlCcyFrstLeg;
    }

    /**
     * Sets the value of the ntnlCcyFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlCcyFrstLeg(String value) {
        this.ntnlCcyFrstLeg = value;
    }

}
