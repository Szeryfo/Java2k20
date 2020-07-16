
package com.example.demo.model.trar2;

import com.example.demo.model.KDPWDocument;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trar.sts.003.02", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "gnlInf",
    "rptDtls",
    "sts"
})
@Entity
public class TrarSts00302 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "GnlInf", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected GeneralInformation1 gnlInf;
    @XmlElement(name = "RptDtls", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected ReportDetails1 rptDtls;
    @XmlElement(name = "Sts", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected Status1 sts;

    @ManyToOne
    @XmlTransient
    private KDPWDocument1 kdpwDocument1;

    public GeneralInformation1 getGnlInf() {
        return gnlInf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public KDPWDocument1 getKdpwDocument() {
        return kdpwDocument1;
    }

    public void setKdpwDocument(KDPWDocument1 kdpwDocument1) {
        this.kdpwDocument1 = kdpwDocument1;
    }


    public void setGnlInf(GeneralInformation1 value) {
        this.gnlInf = value;
    }

    public ReportDetails1 getRptDtls() {
        return rptDtls;
    }


    public void setRptDtls(ReportDetails1 value) {
        this.rptDtls = value;
    }


    public Status1 getSts() {
        return sts;
    }


    public void setSts(Status1 value) {
        this.sts = value;
    }

}
