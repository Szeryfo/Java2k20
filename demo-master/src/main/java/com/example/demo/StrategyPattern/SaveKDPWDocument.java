package com.example.demo.StrategyPattern;

import com.example.demo.model.KDPWDocument;
import com.example.demo.repository.KDPWDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("KDPWDocument")
public class SaveKDPWDocument implements SaveToDbStrategy{

    @Autowired
    private KDPWDocumentRepository kdpwDocumentRepository;

    @Override
    public void saveToDb(Object value) {
        kdpwDocumentRepository.save((KDPWDocument) value);
    }
}
