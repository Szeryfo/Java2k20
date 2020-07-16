
package com.example.demo.model.trar2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reason1", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "rsnCd",
    "rsnTxt"
})
@Entity
public class Reason1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "RsnCd", namespace = "urn:kdpw:xsd:trar.sts.003.02")
    protected String rsnCd;
    @XmlElement(name = "RsnTxt", namespace = "urn:kdpw:xsd:trar.sts.003.02")
    protected String rsnTxt;

    public String getRsnCd() {
        return rsnCd;
    }

    public void setRsnCd(String value) {
        this.rsnCd = value;
    }

    public String getRsnTxt() {
        return rsnTxt;
    }

    public void setRsnTxt(String value) {
        this.rsnTxt = value;
    }

}
