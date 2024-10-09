package com.rahulkardile.webApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        return "Welcome to Spring Boot MVC";
    }

    @RequestMapping("/about")
    @ResponseBody
    public String about(){
        return "About Page Guy's";
    }
}

