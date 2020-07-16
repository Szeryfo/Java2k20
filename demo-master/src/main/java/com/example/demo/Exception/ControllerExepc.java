package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.xml.bind.JAXBException;

@ControllerAdvice
public class ControllerExepc {

        @ExceptionHandler(IllegalArgumentException.class)
        public ResponseEntity illegalArgsExc(){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("File not found");
        }
//        @ExceptionHandler(JAXBException.class)
//        public ResponseEntity jaxbExc(){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Can't use jaxb");
//        }

//        @ExceptionHandler(Throwable.class)
//        public ResponseEntity throwable(){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Throwable");
//        }
    }
