package com.example.demo.StrategyPattern;

import com.example.demo.Model.TrarSts00203.KDPWDocument;
import com.example.demo.repository.KDPWDocument00203Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com.example.demo.model.TrarSts00203.KDPWDocument")
public class SaveKDPWDocument00203 implements SaveToDbStrategy{

    @Autowired
    private KDPWDocument00203Repository kdpwDocument00203Repository;

    @Override
    public void saveToDb(Object value) {
        kdpwDocument00203Repository.save((KDPWDocument) value);
    }
}
