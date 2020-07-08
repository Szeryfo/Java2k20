
package paczka;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}CmmdtyBase"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}CmmdtyDtls"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}DlvryPtOrZone"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}IntrCnnctnPt"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}LdTp"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}DlvryAttr" maxOccurs="unbounded" minOccurs="0"/>
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
    "cmmdtyBase",
    "cmmdtyDtls",
    "dlvryPtOrZone",
    "intrCnnctnPt",
    "ldTp",
    "dlvryAttr"
})
@XmlRootElement(name = "Cmmdty", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class Cmmdty {

    @XmlElement(name = "CmmdtyBase", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String cmmdtyBase;
    @XmlElement(name = "CmmdtyDtls", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String cmmdtyDtls;
    @XmlElement(name = "DlvryPtOrZone", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String dlvryPtOrZone;
    @XmlElement(name = "IntrCnnctnPt", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String intrCnnctnPt;
    @XmlElement(name = "LdTp", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String ldTp;
    @XmlElement(name = "DlvryAttr", namespace = "urn:kdpw:xsd:trar.sts.001.04")
    protected List<DlvryAttr> dlvryAttr;

    /**
     * Gets the value of the cmmdtyBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmmdtyBase() {
        return cmmdtyBase;
    }

    /**
     * Sets the value of the cmmdtyBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmmdtyBase(String value) {
        this.cmmdtyBase = value;
    }

    /**
     * Gets the value of the cmmdtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmmdtyDtls() {
        return cmmdtyDtls;
    }

    /**
     * Sets the value of the cmmdtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmmdtyDtls(String value) {
        this.cmmdtyDtls = value;
    }

    /**
     * Gets the value of the dlvryPtOrZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryPtOrZone() {
        return dlvryPtOrZone;
    }

    /**
     * Sets the value of the dlvryPtOrZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryPtOrZone(String value) {
        this.dlvryPtOrZone = value;
    }

    /**
     * Gets the value of the intrCnnctnPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrCnnctnPt() {
        return intrCnnctnPt;
    }

    /**
     * Sets the value of the intrCnnctnPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrCnnctnPt(String value) {
        this.intrCnnctnPt = value;
    }

    /**
     * Gets the value of the ldTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdTp() {
        return ldTp;
    }

    /**
     * Sets the value of the ldTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdTp(String value) {
        this.ldTp = value;
    }

    /**
     * Gets the value of the dlvryAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlvryAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DlvryAttr }
     * 
     * 
     */
    public List<DlvryAttr> getDlvryAttr() {
        if (dlvryAttr == null) {
            dlvryAttr = new ArrayList<DlvryAttr>();
        }
        return this.dlvryAttr;
    }

}
