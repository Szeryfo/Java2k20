
package com.example.demo.Model.TrarSts00203;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkages", namespace = "urn:kdpw:xsd:trar.sts.002.03", propOrder = {
    "prvsSndrMsgRef"
})
@Entity
public class Linkages {

    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;

    @XmlElement(name = "PrvsSndrMsgRef", namespace = "urn:kdpw:xsd:trar.sts.002.03", required = true)
    protected String prvsSndrMsgRef;

    public String getPrvsSndrMsgRef() {
        return prvsSndrMsgRef;
    }

    public void setPrvsSndrMsgRef(String value) {
        this.prvsSndrMsgRef = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
