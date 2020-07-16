
package com.example.demo.model.trar2;

import com.example.demo.model.TrarSts00203;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KDPWDocument", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
        "trarSts00302"
})
@XmlRootElement(name = "KDPWDocument", namespace = "urn:kdpw:xsd:trar.sts.003.02")
@Entity
public class KDPWDocument1 {


    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;

    @XmlElement(name = "trar.sts.003.02", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToMany(mappedBy = "kdpwDocument1",cascade = CascadeType.ALL)
    protected List<TrarSts00302> trarSts00302;

    @XmlAttribute(name = "Sndr", required = true)
    protected String sndr;
    @XmlAttribute(name = "Rcvr", required = true)
    protected String rcvr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSndr() {
        return sndr;
    }

    public void setSndr(String value) {
        this.sndr = value;
    }

    public String getRcvr() {
        return rcvr;
    }


    public void setRcvr(String value) {
        this.rcvr = value;
    }

    public List<TrarSts00302> getTrarSts00302() {
        return trarSts00302;
    }

    public void setTrarSts00302(List<TrarSts00302> trarSts00302) {
        this.trarSts00302 = trarSts00302;
    }
}
