
package com.example.demo.Model.TrarSts00302;

import javax.persistence.*;
import javax.xml.bind.annotation.*;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty_TR", namespace = "urn:kdpw:xsd:trar.sts.003.02", propOrder = {
    "rptgCtrPtyId",
    "ctrPtySd",
    "othrCtrPty"
})
@Entity
public class CounterpartyTR {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Integer id;

    @XmlElement(name = "RptgCtrPtyId", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    protected String rptgCtrPtyId;
    @XmlElement(name = "CtrPtySd", namespace = "urn:kdpw:xsd:trar.sts.003.02")
    @XmlSchemaType(name = "string")
    protected OptionParty1Code ctrPtySd;
    @XmlElement(name = "OthrCtrPty", namespace = "urn:kdpw:xsd:trar.sts.003.02", required = true)
    @OneToOne(cascade = CascadeType.ALL)
    protected CounterpartyOtherTR othrCtrPty;

    @ManyToOne
    @XmlTransient
    private ReportDetails1 reportDetails1;

    /**
     * Gets the value of the rptgCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptgCtrPtyId() {
        return rptgCtrPtyId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Sets the value of the rptgCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */


    public void setRptgCtrPtyId(String value) {
        this.rptgCtrPtyId = value;
    }

    /**
     * Gets the value of the ctrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty1Code }
     *     
     */
    public OptionParty1Code getCtrPtySd() {
        return ctrPtySd;
    }

    /**
     * Sets the value of the ctrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty1Code }
     *     
     */
    public void setCtrPtySd(OptionParty1Code value) {
        this.ctrPtySd = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyOtherTR }
     *     
     */
    public CounterpartyOtherTR getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyOtherTR }
     *     
     */
    public void setOthrCtrPty(CounterpartyOtherTR value) {
        this.othrCtrPty = value;
    }

}
