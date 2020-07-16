
package com.example.demo.model.trar2;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "OptionParty1Code", namespace = "urn:kdpw:xsd:trar.sts.003.02")
@XmlEnum
public enum OptionParty1Code {

    S,

    B;

    public String value() {
        return name();
    }

    public static OptionParty1Code fromValue(String v) {
        return valueOf(v);
    }

}
