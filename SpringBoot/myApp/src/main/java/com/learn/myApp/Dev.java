package com.learn.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("laptop") // if there are multiple instances that time it will use provided class.
public class Dev {

    @Autowired  // field Injection
    Computer computer;

//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){
        computer.compile();
        System.out.println("Working on Awesome project . . . ");
    }

}
