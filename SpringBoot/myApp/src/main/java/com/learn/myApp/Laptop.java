package com.learn.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compiled with 404 bugs . . . ");
    }
}
