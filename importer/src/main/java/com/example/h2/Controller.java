package com.example.h2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.lang.Exception;
import paczka.KDPWDocument;


import javax.validation.Valid;

@RestController
public class Controller {

    @Autowired
    Tabela2Repo tabela2Repo;

    XmlMarshall xmlMarshall;

    @PostMapping("/xml")
    public ResponseEntity<?> postXmlFile(@Valid @RequestParam MultipartFile file) throws Exception {
        KDPWDocument kdpwDocument = new XmlMarshall().jaxbXmlToObject(file);
        xmlMarshall.jaxbObjectToXml(kdpwDocument); // export
        return ResponseEntity.status(HttpStatus.OK).body(kdpwDocument);
    }
    @GetMapping("/")
    private Iterable<Tabela2> jakastamnazwa(){
        return tabela2Repo.findAll();
    }
}
