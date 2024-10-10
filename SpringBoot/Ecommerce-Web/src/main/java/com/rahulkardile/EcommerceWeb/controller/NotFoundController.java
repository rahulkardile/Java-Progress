package com.rahulkardile.EcommerceWeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotFoundController {

    @GetMapping("*")
    public String Error404(){
        return "Route Not Found";
    }

}
