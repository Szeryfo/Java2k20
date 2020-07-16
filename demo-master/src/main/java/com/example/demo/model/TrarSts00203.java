
package com.example.demo.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trar.sts.002.03", namespace = "urn:kdpw:xsd:trar.sts.002.03", propOrder = {
    "gnlInf",
    "sts"
})
@Entity
public class TrarSts00203 {


    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;

    @XmlElement(name = "GnlInf", namespace = "urn:kdpw:xsd:trar.sts.002.03", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected GeneralInformation gnlInf;
    @XmlElement(name = "Sts", namespace = "urn:kdpw:xsd:trar.sts.002.03", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected Status sts;

    @ManyToOne
    @XmlTransient
    private  KDPWDocument kdpwDocument;
    public GeneralInformation getGnlInf() {
        return gnlInf;
    }

    public void setGnlInf(GeneralInformation value) {
        this.gnlInf = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Status getSts() {
        return sts;
    }

    public void setSts(Status sts) {
        this.sts = sts;
    }
}
