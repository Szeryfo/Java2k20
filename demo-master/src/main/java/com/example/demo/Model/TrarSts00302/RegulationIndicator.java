
package com.example.demo.Model.TrarSts00302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "RegulationIndicator", namespace = "urn:kdpw:xsd:trar.sts.003.02")
@XmlEnum
public enum RegulationIndicator {

    E,

    M,

    B;

    public String value() {
        return name();
    }

    public static RegulationIndicator fromValue(String v) {
        return valueOf(v);
    }

}
