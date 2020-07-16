
package com.example.demo.Model.TrarSts00203;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reason", namespace = "urn:kdpw:xsd:trar.sts.002.03", propOrder = {
    "rsnCd",
    "rsnTxt"
})
@Entity
public class Reason {


    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;


    @XmlElement(name = "RsnCd", namespace = "urn:kdpw:xsd:trar.sts.002.03")
    protected String rsnCd;
    @XmlElement(name = "RsnTxt", namespace = "urn:kdpw:xsd:trar.sts.002.03")
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
