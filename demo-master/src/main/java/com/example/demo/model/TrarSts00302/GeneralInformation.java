
package com.example.demo.Model.TrarSts00302;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInformation", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "rptgNtty",
    "sndrMsgRef",
    "actnTp",
    "lvl",
    "repTmStmp",
    "lnk"
})
@Entity(name = "general_information1")
public class GeneralInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "RptgNtty", namespace = "urn:kdpw:xsd:trar.sts.003.02")
    protected String rptgNtty;
    @XmlElement(name = "SndrMsgRef", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    protected String sndrMsgRef;
    @XmlElement(name = "ActnTp", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    protected String actnTp;
    @XmlElement(name = "Lvl", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    protected String lvl;
    @XmlElement(name = "RepTmStmp", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date repTmStmp;
    @XmlElement(name = "Lnk", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected Linkages lnk;

    public String getRptgNtty() {
        return rptgNtty;
    }

    public void setRptgNtty(String value) {
        this.rptgNtty = value;
    }

    public String getSndrMsgRef() {
        return sndrMsgRef;
    }

    public void setSndrMsgRef(String value) {
        this.sndrMsgRef = value;
    }

    public String getActnTp() {
        return actnTp;
    }

    public void setActnTp(String value) {
        this.actnTp = value;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String value) {
        this.lvl = value;
    }


    public Date getRepTmStmp() {
        return repTmStmp;
    }

    public void setRepTmStmp(Date value) {
        this.repTmStmp = value;
    }

    public Linkages getLnk() {
        return lnk;
    }

    public void setLnk(Linkages value) {
        this.lnk = value;
    }

}
