
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}TradgVn"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Cmprssn"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Pric"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}NtnlAmt"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}PricMltplr"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Qty"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}DlvryTp"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}ExctnDtTm"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}FctvDt"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}TradConf"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}TradClr"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Cmmdty"/>
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
    "tradgVn",
    "cmprssn",
    "pric",
    "ntnlAmt",
    "pricMltplr",
    "qty",
    "dlvryTp",
    "exctnDtTm",
    "fctvDt",
    "tradConf",
    "tradClr",
    "cmmdty"
})
@XmlRootElement(name = "TxData", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class TxData {

    @XmlElement(name = "UnqTradIdr", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String unqTradIdr;
    @XmlElement(name = "TradgVn", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String tradgVn;
    @XmlElement(name = "Cmprssn", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String cmprssn;
    @XmlElement(name = "Pric", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected Pric pric;
    @XmlElement(name = "NtnlAmt", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String ntnlAmt;
    @XmlElement(name = "PricMltplr", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String pricMltplr;
    @XmlElement(name = "Qty", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String qty;
    @XmlElement(name = "DlvryTp", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String dlvryTp;
    @XmlElement(name = "ExctnDtTm", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String exctnDtTm;
    @XmlElement(name = "FctvDt", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String fctvDt;
    @XmlElement(name = "TradConf", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected TradConf tradConf;
    @XmlElement(name = "TradClr", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected TradClr tradClr;
    @XmlElement(name = "Cmmdty", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected Cmmdty cmmdty;

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
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgVn(String value) {
        this.tradgVn = value;
    }

    /**
     * Gets the value of the cmprssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmprssn() {
        return cmprssn;
    }

    /**
     * Sets the value of the cmprssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmprssn(String value) {
        this.cmprssn = value;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Pric }
     *     
     */
    public Pric getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pric }
     *     
     */
    public void setPric(Pric value) {
        this.pric = value;
    }

    /**
     * Gets the value of the ntnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlAmt() {
        return ntnlAmt;
    }

    /**
     * Sets the value of the ntnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlAmt(String value) {
        this.ntnlAmt = value;
    }

    /**
     * Gets the value of the pricMltplr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricMltplr() {
        return pricMltplr;
    }

    /**
     * Sets the value of the pricMltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricMltplr(String value) {
        this.pricMltplr = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryTp(String value) {
        this.dlvryTp = value;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExctnDtTm(String value) {
        this.exctnDtTm = value;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFctvDt(String value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the tradConf property.
     * 
     * @return
     *     possible object is
     *     {@link TradConf }
     *     
     */
    public TradConf getTradConf() {
        return tradConf;
    }

    /**
     * Sets the value of the tradConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradConf }
     *     
     */
    public void setTradConf(TradConf value) {
        this.tradConf = value;
    }

    /**
     * Gets the value of the tradClr property.
     * 
     * @return
     *     possible object is
     *     {@link TradClr }
     *     
     */
    public TradClr getTradClr() {
        return tradClr;
    }

    /**
     * Sets the value of the tradClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradClr }
     *     
     */
    public void setTradClr(TradClr value) {
        this.tradClr = value;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link Cmmdty }
     *     
     */
    public Cmmdty getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cmmdty }
     *     
     */
    public void setCmmdty(Cmmdty value) {
        this.cmmdty = value;
    }

}
