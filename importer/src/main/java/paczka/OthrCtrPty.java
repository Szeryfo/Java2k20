
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Id"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Ctry"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}EMIROblgtn"/>
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
    "id",
    "ctry",
    "emirOblgtn"
})
@XmlRootElement(name = "OthrCtrPty", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class OthrCtrPty {

    @XmlElement(name = "Id", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected Id id;
    @XmlElement(name = "Ctry", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String ctry;
    @XmlElement(name = "EMIROblgtn", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String emirOblgtn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the emirOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMIROblgtn() {
        return emirOblgtn;
    }

    /**
     * Sets the value of the emirOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMIROblgtn(String value) {
        this.emirOblgtn = value;
    }

}
