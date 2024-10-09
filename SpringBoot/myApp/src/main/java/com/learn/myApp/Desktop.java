package com.learn.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary   //in case of mutiple instance this one help to tell that use this one.

public class Desktop implements Computer {

    public void compile(){
        System.out.println("Compiled with 404 bugs . . . ");
    }
}
