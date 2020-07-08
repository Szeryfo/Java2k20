
package paczka;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{urn:kdpw:xsd:trar.sts.001.04}trar.sts.001.04" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Sndr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Rcvr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trarSts00104"
})
@XmlRootElement(name = "KDPWDocument", namespace = "urn:kdpw:xsd:trar.sts.001.04")
public class KDPWDocument {

    @XmlElement(name = "trar.sts.001.04", namespace = "urn:kdpw:xsd:trar.sts.001.04")
    protected List<TrarSts00104> trarSts00104;
    @XmlAttribute(name = "Sndr")
    protected String sndr;
    @XmlAttribute(name = "Rcvr")
    protected String rcvr;

    /**
     * Gets the value of the trarSts00104 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trarSts00104 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrarSts00104().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrarSts00104 }
     * 
     * 
     */
    public List<TrarSts00104> getTrarSts00104() {
        if (trarSts00104 == null) {
            trarSts00104 = new ArrayList<TrarSts00104>();
        }
        return this.trarSts00104;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndr(String value) {
        this.sndr = value;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvr(String value) {
        this.rcvr = value;
    }

}
