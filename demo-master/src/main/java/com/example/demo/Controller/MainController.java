package com.example.demo.Controller;

import com.example.demo.Parse.Converter;

import com.example.demo.StrategyPattern.SaveToDbStrategy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
public class MainController {

    Converter converter = new Converter();

    private final Map<String, SaveToDbStrategy> saveToDbStrategyMap;

    public MainController( Map<String, SaveToDbStrategy> saveToDbStrategyMap) {
        this.saveToDbStrategyMap = saveToDbStrategyMap;
    }


    @PostMapping("/parse")
    public ResponseEntity<?> postXmlFile(@RequestPart MultipartFile file) throws Exception {

        Object o = converter.getObject(converter.getFile(file));
        Object kdpwDocument = converter.xmlUnmarshall(file,o);
        converter.xmlMarshall(kdpwDocument,o);

        SaveToDbStrategy saveToDbStrategy = saveToDbStrategyMap.get(kdpwDocument.getClass().getName());
        saveToDbStrategy.saveToDb(kdpwDocument);
        return ResponseEntity.status(HttpStatus.OK).body(kdpwDocument);
    }
}
