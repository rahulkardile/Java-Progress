package com.lentra.SecurityApp.controller;

import com.lentra.SecurityApp.entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Hello {

    @Autowired
    private Response response;

    @GetMapping
    public ResponseEntity<Response> greet(){
        response.setMessage("Welcome to the Spring World!");
        response.setStatusCode(200);
        response.setSuccess(true);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
