package com.example.demo.Parse;


import com.example.demo.model.KDPWDocument;
import com.example.demo.model.trar2.KDPWDocument1;
import com.example.demo.repository.KDPWDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Converter {

    private  Map<String,Object> stringObjectMap = new HashMap<>();


    public File getFile(MultipartFile file) throws IOException {
        File nFile = new File(file.getOriginalFilename());
        nFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(nFile);
        fos.write(file.getBytes());
        fos.close();
        return nFile;
    }

    public Object getObject(File file) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        Element element = document.getDocumentElement();

        stringObjectMap.put("urn:kdpw:xsd:trar.sts.003.02", new KDPWDocument1());
        stringObjectMap.put("urn:kdpw:xsd:trar.sts.002.03", new KDPWDocument());

        return stringObjectMap.get(element.getAttribute("xmlns"));
    }

    public Object xmlUnmarshall(MultipartFile file, Object o) throws Exception {

        JAXBContext jaxbContext = JAXBContext.newInstance(o.getClass());

        return jaxbContext.createUnmarshaller().unmarshal(getFile(file));
    }

    public static void xmlMarshall(Object value,Object o) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(o.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        File file = new File("test.xml");
        marshaller.marshal(value, file);
    }
}
