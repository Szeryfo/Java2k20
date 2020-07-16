
package com.example.demo.Model.TrarSts00203;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KDPWDocument", namespace = "urn:kdpw:xsd:trar.sts.002.03", propOrder = {
    "trarSts00203"
})
@XmlRootElement(name = "KDPWDocument", namespace = "urn:kdpw:xsd:trar.sts.002.03")
@Entity
public class KDPWDocument {


    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;

    @XmlElement(name = "trar.sts.002.03", namespace = "urn:kdpw:xsd:trar.sts.002.03", required = true)
    @OneToMany(mappedBy = "kdpwDocument",cascade = CascadeType.ALL)
    protected List<TrarSts00203> trarSts00203 ;

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

    public List<TrarSts00203> getTrarSts00203() {
        return trarSts00203;
    }

    public void setTrarSts00203(List<TrarSts00203> trarSts00203) {
        this.trarSts00203 = trarSts00203;
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

}
