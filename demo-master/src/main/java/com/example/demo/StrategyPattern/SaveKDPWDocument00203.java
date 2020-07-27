package com.example.demo.StrategyPattern;

import com.example.demo.Model.TrarSts00203.KDPWDocument;
import com.example.demo.Parse.Converter;
import com.example.demo.repository.KDPWDocument00203Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component("com.example.demo.Model.TrarSts00203.KDPWDocument")
public class SaveKDPWDocument00203 implements SaveToDbStrategy{

    @Autowired
    private KDPWDocument00203Repository kdpwDocument00203Repository;

    @Override
    public void saveToDb(Object value) {
        kdpwDocument00203Repository.save((KDPWDocument) value);
    }

    @Override
    public boolean verify(Object value) {
        if(value.getClass().getName().equals("com.example.demo.Model.TrarSts00203.KDPWDocument"))
        {
            return true;
        }
        return false;
    }

  //  @Override
  //  public boolean validateXMLSchema(File file) {
  //      return new Converter().validateXMLSchema("src\\main\\resources\\trar.sts.002.03.xsd", file);
   // }
}
