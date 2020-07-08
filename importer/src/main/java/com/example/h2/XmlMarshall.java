package com.example.h2;


import org.springframework.web.multipart.MultipartFile;
import paczka.KDPWDocument;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.lang.Exception;

public class XmlMarshall {
    public KDPWDocument jaxbXmlToObject(MultipartFile file) throws Exception {

        KDPWDocument kdpwDocument;
        JAXBContext jaxbContext = JAXBContext.newInstance(KDPWDocument.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            File convFile = new File(file.getOriginalFilename());
            convFile.createNewFile();
            FileOutputStream fos = new FileOutputStream(convFile);
            fos.write(file.getBytes());
            fos.close();
            kdpwDocument = (KDPWDocument) unmarshaller.unmarshal(convFile);

        return kdpwDocument;
    }
    public void jaxbObjectToXml(KDPWDocument kdpwDocument) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(KDPWDocument.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        File file = new File("nowyKomunikat.xml");

        marshaller.marshal(kdpwDocument, file);
    }
}
