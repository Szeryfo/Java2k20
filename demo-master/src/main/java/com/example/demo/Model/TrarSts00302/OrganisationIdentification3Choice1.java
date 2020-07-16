
package com.example.demo.Model.TrarSts00302;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification3Choice__1", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "lei",
    "clntId"
})
@Entity
public class OrganisationIdentification3Choice1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "LEI", namespace = "urn:kdpw:xsd:trar.sts.003.02")
    protected String lei;
    @XmlElement(name = "ClntId", namespace = "urn:kdpw:xsd:trar.sts.003.02")
    protected String clntId;

    public String getLEI() {
        return lei;
    }

    public void setLEI(String value) {
        this.lei = value;
    }

    public String getClntId() {
        return clntId;
    }

    public void setClntId(String value) {
        this.clntId = value;
    }

}
