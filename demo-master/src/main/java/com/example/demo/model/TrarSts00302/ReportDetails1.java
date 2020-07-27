
package com.example.demo.Model.TrarSts00302;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDetails_1", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "eligDt",
    "rglntInd",
    "ctrPty",
    "txData"
})
@Entity
public class ReportDetails1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "EligDt", namespace = "urn:kdpw:xsd:trar.sts.003.02")
    @XmlSchemaType(name = "date")
    protected Date eligDt;
    @XmlElement(name = "RglntInd", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @XmlSchemaType(name = "string")
    protected RegulationIndicator rglntInd;
    @XmlElement(name = "CtrPty", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToMany(mappedBy = "reportDetails1",cascade = CascadeType.ALL)
    protected List<CounterpartyTR> ctrPty;
    @XmlElement(name = "TxData", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected TradeTransaction113 txData;

    public Date getEligDt() {
        return eligDt;
    }

    public void setEligDt(Date value) {
        this.eligDt = value;
    }

    public RegulationIndicator getRglntInd() {
        return rglntInd;
    }

    public void setRglntInd(RegulationIndicator value) {
        this.rglntInd = value;
    }

    public List<CounterpartyTR> getCtrPty() {
        if (ctrPty == null) {
            ctrPty = new ArrayList<CounterpartyTR>();
        }
        return this.ctrPty;
    }

    public TradeTransaction113 getTxData() {
        return txData;
    }

    public void setTxData(TradeTransaction113 value) {
        this.txData = value;
    }

}
