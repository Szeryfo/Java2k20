
package com.example.demo.Parse;

import com.example.demo.model.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _KDPWDocument_QNAME = new QName("urn:kdpw:xsd:trar.sts.002.03", "KDPWDocument");

    public ObjectFactory() {
    }

    public KDPWDocument createKDPWDocument() {
        return new KDPWDocument();
    }

    public DateAndDateTimeChoice createDateAndDateTimeChoice() {
        return new DateAndDateTimeChoice();
    }

    public Linkages createLinkages() {
        return new Linkages();
    }

    public Status createStatus() {
        return new Status();
    }

    public TrarSts00203 createTrarSts00203() {
        return new TrarSts00203();
    }

    public Reason createReason() {
        return new Reason();
    }

    public GeneralInformation createGeneralInformation() {
        return new GeneralInformation();
    }

    @XmlElementDecl(namespace = "urn:kdpw:xsd:trar.sts.002.03", name = "KDPWDocument")
    public JAXBElement<KDPWDocument> createKDPWDocument(KDPWDocument value) {
        return new JAXBElement<KDPWDocument>(_KDPWDocument_QNAME, KDPWDocument.class, null, value);
    }

}
