
package com.example.demo.Model.TrarSts00302;

import javax.persistence.*;
import javax.xml.bind.annotation.*;


/**
 * Status
 * 
 * <p>Java class for Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StsCd" type="{urn:kdpw:xsd:trar.sts.003.02}Code4Text"/>
 *         &lt;element name="Rsn" type="{urn:kdpw:xsd:trar.sts.003.02}Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "status", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "stsCd",
    "rsn"
})
@Entity(name = "status1")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "StsCd", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    protected String stsCd;
    @XmlElement(name = "Rsn", namespace = "urn:kdpw:xsd:trar.sts.003.02")
    @OneToOne(cascade = CascadeType.ALL)
    protected Reason rsn;

    public String getStsCd() {
        return stsCd;
    }

    public void setStsCd(String value) {
        this.stsCd = value;
    }

    public Reason getRsn() {
        return rsn;
    }

    public void setRsn(Reason value) {
        this.rsn = value;
    }

}
