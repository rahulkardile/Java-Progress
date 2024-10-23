package com.storyin.learnSecurity.contoller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @GetMapping("/")
    public String greet(HttpServletRequest req){
        return "Hello Buddy How Are You! \n" + req.getSession().getId();
    }

}
