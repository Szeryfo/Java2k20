package com.example.demo.StrategyPattern;

import java.io.File;

public interface SaveToDbStrategy {
    void saveToDb(Object value);
    boolean verify(Object value);
}
