package com.example.h2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import javax.xml.bind.JAXBException;

@ControllerAdvice
public class Exception {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity xmlException(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("File not found");
    }
    @ExceptionHandler(JAXBException.class)
    public ResponseEntity xmlException2(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed");
    }
    @ExceptionHandler(Throwable.class)
    public ResponseEntity xmlException3(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Throwable");
    }
}
