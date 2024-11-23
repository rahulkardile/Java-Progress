package com.example.mvn_test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Hello {

    @GetMapping
    public ResponseEntity<?> Greet() {
        return new ResponseEntity<>("Welcome guy's" , HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> Done( RequestBody name ) {

        try {
            String greet = "Welcome " + name;
            return new ResponseEntity<>(greet , HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
