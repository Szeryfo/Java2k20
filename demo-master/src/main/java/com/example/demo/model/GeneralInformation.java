
package com.example.demo.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInformation", namespace = "urn:kdpw:xsd:trar.sts.002.03", propOrder = {
    "sndrMsgRef",
    "repTmStmp",
    "actnTp",
    "eligDt",
    "lnk"
})
@Entity
public class GeneralInformation {


    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;

    @XmlElement(name = "SndrMsgRef", namespace = "urn:kdpw:xsd:trar.sts.002.03", required = true)
    protected String sndrMsgRef;
    @XmlElement(name = "RepTmStmp", namespace = "urn:kdpw:xsd:trar.sts.002.03")
    @XmlSchemaType(name = "dateTime")
    protected Date repTmStmp;
    @XmlElement(name = "ActnTp", namespace = "urn:kdpw:xsd:trar.sts.002.03", required = true)
    protected String actnTp;
    @XmlElement(name = "EligDt", namespace = "urn:kdpw:xsd:trar.sts.002.03")
    @XmlSchemaType(name = "date")
    protected Date eligDt;
    @XmlElement(name = "Lnk", namespace = "urn:kdpw:xsd:trar.sts.002.03", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected Linkages lnk;

    public String getSndrMsgRef() {
        return sndrMsgRef;
    }

    public void setSndrMsgRef(String value) {
        this.sndrMsgRef = value;
    }

    public Date getRepTmStmp() {
        return repTmStmp;
    }


    public void setRepTmStmp(Date value) {
        this.repTmStmp = value;
    }

    public String getActnTp() {
        return actnTp;
    }

    public void setActnTp(String value) {
        this.actnTp = value;
    }

    public Date getEligDt() {
        return eligDt;
    }

    public void setEligDt(Date value) {
        this.eligDt = value;
    }

    public Linkages getLnk() {
        return lnk;
    }

    public void setLnk(Linkages value) {
        this.lnk = value;
    }

}
