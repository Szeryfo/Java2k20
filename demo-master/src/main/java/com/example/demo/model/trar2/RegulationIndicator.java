
package com.example.demo.model.trar2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlTransient;
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
