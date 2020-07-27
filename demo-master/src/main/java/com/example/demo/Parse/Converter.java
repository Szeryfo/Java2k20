package com.example.demo.Parse;

import com.example.demo.Model.TrarSts00302.KDPWDocument;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Converter {

    private static Map<String,Object> stringObjectMap = new HashMap<>();
    private static Map<String,String> stringStringMap = new HashMap<>();

    static  {
        stringObjectMap.put("urn:kdpw:xsd:trar.sts.003.02", new KDPWDocument());
        stringObjectMap.put("urn:kdpw:xsd:trar.sts.002.03", new com.example.demo.Model.TrarSts00203.KDPWDocument());
        stringStringMap.put("urn:kdpw:xsd:trar.sts.003.02", "src\\main\\resources\\trar.sts.003.02.xsd");
        stringStringMap.put("urn:kdpw:xsd:trar.sts.002.03", "src\\main\\resources\\trar.sts.002.03.xsd");
    }

    public File getFile(MultipartFile file) throws IOException {
        File nFile = new File(file.getOriginalFilename());
        nFile.createNewFile();
 //       FileOutputStream fos = new FileOutputStream(nFile);
 //       fos.write(file.getBytes());
 //       fos.close();
        return nFile;
    }

    public Object getObject(File file) throws IOException, SAXException, ParserConfigurationException {
        return stringObjectMap.get(getNamespace(file));
    }


    public void xmlMarshall(Object value,Object o) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(o.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        File file = new File("test.xml");
        marshaller.marshal(value, file);
    }

    public Object xmlUnmarshall(File file, Object o) throws Exception {

        JAXBContext jaxbContext = JAXBContext.newInstance(o.getClass());
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setSchema(createSchema(file));

        return unmarshaller.unmarshal(file);
    }

    public Schema createSchema(File file) throws SAXException, IOException, ParserConfigurationException {
        SchemaFactory factory =
                SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(new File(stringStringMap.get(getNamespace(file))));

        return  schema;
    }

    public String getNamespace(File file) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);

        return  document.getDocumentElement().getAttribute("xmlns");
    }

}