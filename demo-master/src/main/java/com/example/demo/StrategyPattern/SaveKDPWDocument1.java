package com.example.demo.StrategyPattern;

import com.example.demo.model.trar2.KDPWDocument1;
import com.example.demo.repository.KDPWDocument1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("KDPWDocument1")
public class SaveKDPWDocument1 implements SaveToDbStrategy{

    @Autowired
    private KDPWDocument1Repository kdpwDocument1Repository;

    @Override
    public void saveToDb(Object value) {
        kdpwDocument1Repository.save((KDPWDocument1) value);
    }
}
