package com.storyin.journalApp.controller;

import com.storyin.journalApp.entity.UserEntity;
import com.storyin.journalApp.service.UserService;
import com.storyin.journalApp.utils.ErrorHandler;
import org.apache.catalina.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers(){
        List<UserEntity> users = userService.getAll();

        if(users.equals(null) || users.isEmpty()){
            ErrorHandler errorHandler = new ErrorHandler("No user awailable!", 404);
            System.out.println("not found route is hit!");
            return new ResponseEntity<>("No Content", HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(users, HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody UserEntity user ){
        userService.saveEntry(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateUser(@RequestBody UserEntity newEntry){

        UserEntity old = userService.findByUsername(newEntry.getUsername());

        if(old != null){
            old.setUsername(newEntry.getUsername());
            old.setPassword(newEntry.getPassword());
        }else {
            return new ResponseEntity<>("User Not Found", HttpStatus.CREATED);
        }

        userService.saveEntry(old);
        return new ResponseEntity<>(old, HttpStatus.CREATED);

    }

}


