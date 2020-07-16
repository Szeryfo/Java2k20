
package com.example.demo.Model.TrarSts00302;

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
    protected GeneralInformation gnlInf;
    @XmlElement(name = "RptDtls", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected ReportDetails1 rptDtls;
    @XmlElement(name = "Sts", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected Status sts;

    @ManyToOne
    @XmlTransient
    private KDPWDocument kdpwDocument;

    public GeneralInformation getGnlInf() {
        return gnlInf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public KDPWDocument getKdpwDocument() {
        return kdpwDocument;
    }

    public void setKdpwDocument(KDPWDocument kdpwDocument) {
        this.kdpwDocument = kdpwDocument;
    }


    public void setGnlInf(GeneralInformation value) {
        this.gnlInf = value;
    }

    public ReportDetails1 getRptDtls() {
        return rptDtls;
    }


    public void setRptDtls(ReportDetails1 value) {
        this.rptDtls = value;
    }


    public Status getSts() {
        return sts;
    }


    public void setSts(Status value) {
        this.sts = value;
    }

}
