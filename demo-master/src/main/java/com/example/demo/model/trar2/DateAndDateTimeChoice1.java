
package com.example.demo.model.trar2;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndDateTimeChoice1", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "dt",
    "dtTm"
})
@Entity
public class DateAndDateTimeChoice1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "Dt", namespace = "urn:kdpw:xsd:trar.sts.003.02")
    @XmlSchemaType(name = "date")
    protected Date dt;
    @XmlElement(name = "DtTm", namespace = "urn:kdpw:xsd:trar.sts.003.02")
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
