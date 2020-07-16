package com.example.demo.StrategyPattern;

import com.example.demo.Model.TrarSts00302.KDPWDocument;
import com.example.demo.repository.KDPWDocument00302Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com.example.demo.model.TrarSts00302.KDPWDocument")
public class SaveKDPWDocument00302 implements SaveToDbStrategy{

    @Autowired
    private KDPWDocument00302Repository kdpwDocument00302Repository;

    @Override
    public void saveToDb(Object value) {
        kdpwDocument00302Repository.save((KDPWDocument) value);
    }
}
