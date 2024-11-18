package com.lentra.SecurityApp.controller;

import com.lentra.SecurityApp.entity.Response;
import com.lentra.SecurityApp.entity.Users;
import com.lentra.SecurityApp.repository.UserRepo;
import com.lentra.SecurityApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public ResponseEntity<?> users(@RequestBody Users user){
        Response response = new Response();
        if(service.createNewUser(user)){
            response.setMessage("User Created Successfully");
            response.setStatusCode(HttpStatus.CREATED.value( ));
            response.setSuccess(true);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }else {
            response.setMessage("Username Already exist!");
            response.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value( ));
            response.setSuccess(false);
            return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
        }

    }

}
