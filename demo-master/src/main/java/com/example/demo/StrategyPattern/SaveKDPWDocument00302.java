package com.example.demo.StrategyPattern;

import com.example.demo.Model.TrarSts00302.KDPWDocument;
import com.example.demo.Parse.Converter;
import com.example.demo.repository.KDPWDocument00302Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component("com.example.demo.Model.TrarSts00302.KDPWDocument")
public class SaveKDPWDocument00302 implements SaveToDbStrategy{

    @Autowired
    private KDPWDocument00302Repository kdpwDocument00302Repository;

    @Override
    public void saveToDb(Object value) {
        kdpwDocument00302Repository.save((KDPWDocument) value);
    }

    @Override
    public boolean verify(Object value) {
        if(value.getClass().getName().equals("com.example.demo.Model.TrarSts00302.KDPWDocument"))
        {
            return true;
        }
        return false;
    }

 //   @Override
 //   public boolean validateXMLSchema(File file) {
 //       return new Converter().validateXMLSchema("src\\main\\resources\\trar.sts.003.02.xsd", file);
  //  }
}
