package com.lentra.SecurityApp.controller;

import com.lentra.SecurityApp.entity.Response;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class Hello {

    @Autowired
    private Response response;

    @GetMapping
    public ResponseEntity<Response> greet(HttpServletRequest req){
        response.setMessage("Welcome to the Spring World!" + req.getSession().getId());
        response.setStatusCode(200);
        response.setSuccess(true);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrf(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }

}
