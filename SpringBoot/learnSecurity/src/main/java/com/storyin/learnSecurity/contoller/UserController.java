package com.storyin.learnSecurity.contoller;

import com.storyin.learnSecurity.entity.Users;
import com.storyin.learnSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String greet(){
        return "Hello Buddy from user . . .";
    }

    @PostMapping("/register")
    public Users save( @RequestBody Users user ) {
        return userService.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return "Success!";
    }



}
