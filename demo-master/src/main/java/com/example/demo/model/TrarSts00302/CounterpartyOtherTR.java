
package com.example.demo.Model.TrarSts00302;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyOther_TR", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "id"
})
@Entity
public class CounterpartyOtherTR {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer c_id;

    @XmlElement(name = "Id", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected OrganisationIdentification3Choice1 id;

    public OrganisationIdentification3Choice1 getId() {
        return id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public void setId(OrganisationIdentification3Choice1 value) {
        this.id = value;
    }

}
