
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}DlvryIntrvl"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}DlvryPrd"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Drtn"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}WkDay"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}DlvryCpcty"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}QtyUnit"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}PricTmIntrvlQty"/>
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
    "dlvryIntrvl",
    "dlvryPrd",
    "drtn",
    "wkDay",
    "dlvryCpcty",
    "qtyUnit",
    "pricTmIntrvlQty"
})
@XmlRootElement(name = "DlvryAttr", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class DlvryAttr {

    @XmlElement(name = "DlvryIntrvl", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String dlvryIntrvl;
    @XmlElement(name = "DlvryPrd", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected DlvryPrd dlvryPrd;
    @XmlElement(name = "Drtn", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String drtn;
    @XmlElement(name = "WkDay", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String wkDay;
    @XmlElement(name = "DlvryCpcty", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String dlvryCpcty;
    @XmlElement(name = "QtyUnit", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String qtyUnit;
    @XmlElement(name = "PricTmIntrvlQty", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String pricTmIntrvlQty;

    /**
     * Gets the value of the dlvryIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryIntrvl() {
        return dlvryIntrvl;
    }

    /**
     * Sets the value of the dlvryIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryIntrvl(String value) {
        this.dlvryIntrvl = value;
    }

    /**
     * Gets the value of the dlvryPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DlvryPrd }
     *     
     */
    public DlvryPrd getDlvryPrd() {
        return dlvryPrd;
    }

    /**
     * Sets the value of the dlvryPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlvryPrd }
     *     
     */
    public void setDlvryPrd(DlvryPrd value) {
        this.dlvryPrd = value;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrtn(String value) {
        this.drtn = value;
    }

    /**
     * Gets the value of the wkDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWkDay() {
        return wkDay;
    }

    /**
     * Sets the value of the wkDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWkDay(String value) {
        this.wkDay = value;
    }

    /**
     * Gets the value of the dlvryCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryCpcty() {
        return dlvryCpcty;
    }

    /**
     * Sets the value of the dlvryCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryCpcty(String value) {
        this.dlvryCpcty = value;
    }

    /**
     * Gets the value of the qtyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * Sets the value of the qtyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtyUnit(String value) {
        this.qtyUnit = value;
    }

    /**
     * Gets the value of the pricTmIntrvlQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricTmIntrvlQty() {
        return pricTmIntrvlQty;
    }

    /**
     * Sets the value of the pricTmIntrvlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricTmIntrvlQty(String value) {
        this.pricTmIntrvlQty = value;
    }

}
