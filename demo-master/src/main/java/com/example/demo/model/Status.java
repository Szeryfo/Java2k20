
package com.example.demo.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", namespace = "urn:kdpw:xsd:trar.sts.002.03", propOrder = {
    "stsCd",
    "rsn"
})
@Entity
public class Status {


    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;


    @XmlElement(name = "StsCd", namespace = "urn:kdpw:xsd:trar.sts.002.03", required = true)
    protected String stsCd;
    @XmlElement(name = "Rsn", namespace = "urn:kdpw:xsd:trar.sts.002.03")
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
