
package com.example.demo.Model.TrarSts00302;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransaction11__3", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "unqTradIdr"
})
@Entity
public class TradeTransaction113 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "UnqTradIdr", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    protected String unqTradIdr;

    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    public void setUnqTradIdr(String value) {
        this.unqTradIdr = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
