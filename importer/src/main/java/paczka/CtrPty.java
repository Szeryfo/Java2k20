
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}RptgCtrPtyId"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}CtrPtySd"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Sctr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Ntr"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Bnfcry"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}TradgCpcty"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}CmmrclActvty"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}ClrTrshld"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}OthrCtrPty"/>
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
    "rptgCtrPtyId",
    "ctrPtySd",
    "sctr",
    "ntr",
    "bnfcry",
    "tradgCpcty",
    "cmmrclActvty",
    "clrTrshld",
    "othrCtrPty"
})
@XmlRootElement(name = "CtrPty", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class CtrPty {

    @XmlElement(name = "RptgCtrPtyId", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String rptgCtrPtyId;
    @XmlElement(name = "CtrPtySd", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String ctrPtySd;
    @XmlElement(name = "Sctr", namespace = "urn:kdpw:xsd:trar.sts.001.04")
    protected List<String> sctr;
    @XmlElement(name = "Ntr", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String ntr;
    @XmlElement(name = "Bnfcry", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected Bnfcry bnfcry;
    @XmlElement(name = "TradgCpcty", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String tradgCpcty;
    @XmlElement(name = "CmmrclActvty", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String cmmrclActvty;
    @XmlElement(name = "ClrTrshld", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String clrTrshld;
    @XmlElement(name = "OthrCtrPty", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected OthrCtrPty othrCtrPty;

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
     * Gets the value of the ctrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtySd() {
        return ctrPtySd;
    }

    /**
     * Sets the value of the ctrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPtySd(String value) {
        this.ctrPtySd = value;
    }

    /**
     * Gets the value of the sctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSctr() {
        if (sctr == null) {
            sctr = new ArrayList<String>();
        }
        return this.sctr;
    }

    /**
     * Gets the value of the ntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtr() {
        return ntr;
    }

    /**
     * Sets the value of the ntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtr(String value) {
        this.ntr = value;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link Bnfcry }
     *     
     */
    public Bnfcry getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bnfcry }
     *     
     */
    public void setBnfcry(Bnfcry value) {
        this.bnfcry = value;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgCpcty(String value) {
        this.tradgCpcty = value;
    }

    /**
     * Gets the value of the cmmrclActvty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmmrclActvty() {
        return cmmrclActvty;
    }

    /**
     * Sets the value of the cmmrclActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmmrclActvty(String value) {
        this.cmmrclActvty = value;
    }

    /**
     * Gets the value of the clrTrshld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrTrshld() {
        return clrTrshld;
    }

    /**
     * Sets the value of the clrTrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrTrshld(String value) {
        this.clrTrshld = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link OthrCtrPty }
     *     
     */
    public OthrCtrPty getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthrCtrPty }
     *     
     */
    public void setOthrCtrPty(OthrCtrPty value) {
        this.othrCtrPty = value;
    }

}
