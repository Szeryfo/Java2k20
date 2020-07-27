
package com.example.demo.Model.TrarSts00203;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.*;
import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndDateTimeChoice", namespace = "urn:kdpw:xsd:trar.sts.002.03", propOrder = {
    "dt",
    "dtTm"
})
@Entity
public class DateAndDateTimeChoice {

    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;

    @XmlElement(name = "Dt", namespace = "urn:kdpw:xsd:trar.sts.002.03")
    @XmlSchemaType(name = "date")
    protected Date dt;
    @XmlElement(name = "DtTm", namespace = "urn:kdpw:xsd:trar.sts.002.03")
    @XmlSchemaType(name = "dateTime")
    protected Date dtTm;

    public Date getDt() {
        return dt;
    }

    public void setDt(Date value) {
        this.dt = value;
    }

    public Date getDtTm() {
        return dtTm;
    }

    public void setDtTm(Date value) {
        this.dtTm = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
