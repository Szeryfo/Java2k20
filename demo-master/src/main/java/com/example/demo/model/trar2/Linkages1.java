
package com.example.demo.model.trar2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkages1", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "prvsSndrMsgRef",
    "tradRefId"
})
@Entity
public class Linkages1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "PrvsSndrMsgRef", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    protected String prvsSndrMsgRef;
    @XmlElement(name = "TradRefId", namespace = "urn:kdpw:xsd:trar.sts.003.02")
    @OneToMany(mappedBy = "linkages",cascade = CascadeType.ALL)
    protected List<TradeReference> tradRefId;


    public String getPrvsSndrMsgRef() {
        return prvsSndrMsgRef;
    }


    public void setPrvsSndrMsgRef(String value) {
        this.prvsSndrMsgRef = value;
    }

    public List<TradeReference> getTradRefId() {
        if (tradRefId == null) {
            tradRefId = new ArrayList<TradeReference>();
        }
        return this.tradRefId;
    }

}
