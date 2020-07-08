
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}SndrMsgRef"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}ActnTp"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Lvl"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}RepTmStmp"/>
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}Lnk"/>
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
    "sndrMsgRef",
    "actnTp",
    "lvl",
    "repTmStmp",
    "lnk"
})
@XmlRootElement(name = "GnlInf", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class GnlInf {

    @XmlElement(name = "SndrMsgRef", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String sndrMsgRef;
    @XmlElement(name = "ActnTp", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String actnTp;
    @XmlElement(name = "Lvl", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String lvl;
    @XmlElement(name = "RepTmStmp", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected String repTmStmp;
    @XmlElement(name = "Lnk", namespace = "urn:kdpw:xsd:trar.sts.001.04", required = true)
    protected Lnk lnk;

    /**
     * Gets the value of the sndrMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrMsgRef() {
        return sndrMsgRef;
    }

    /**
     * Sets the value of the sndrMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndrMsgRef(String value) {
        this.sndrMsgRef = value;
    }

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActnTp(String value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the lvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLvl() {
        return lvl;
    }

    /**
     * Sets the value of the lvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLvl(String value) {
        this.lvl = value;
    }

    /**
     * Gets the value of the repTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepTmStmp() {
        return repTmStmp;
    }

    /**
     * Sets the value of the repTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepTmStmp(String value) {
        this.repTmStmp = value;
    }

    /**
     * Gets the value of the lnk property.
     * 
     * @return
     *     possible object is
     *     {@link Lnk }
     *     
     */
    public Lnk getLnk() {
        return lnk;
    }

    /**
     * Sets the value of the lnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lnk }
     *     
     */
    public void setLnk(Lnk value) {
        this.lnk = value;
    }

}
