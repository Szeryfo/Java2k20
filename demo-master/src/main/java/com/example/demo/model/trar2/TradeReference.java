
package com.example.demo.model.trar2;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReference", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "unqTradIdr",
    "rptgCtrPtyId",
    "othrCtrPtyId"
})
@Entity
public class TradeReference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "UnqTradIdr", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    protected String unqTradIdr;
    @XmlElement(name = "RptgCtrPtyId", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    protected String rptgCtrPtyId;
    @XmlElement(name = "OthrCtrPtyId", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    protected String othrCtrPtyId;

    @ManyToOne
    @XmlTransient
    private Linkages1 linkages;

    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    public void setUnqTradIdr(String value) {
        this.unqTradIdr = value;
    }

    public String getRptgCtrPtyId() {
        return rptgCtrPtyId;
    }

    public void setRptgCtrPtyId(String value) {
        this.rptgCtrPtyId = value;
    }

    public String getOthrCtrPtyId() {
        return othrCtrPtyId;
    }

    public void setOthrCtrPtyId(String value) {
        this.othrCtrPtyId = value;
    }

}
