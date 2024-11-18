package com.lentra.SecurityApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private int marks;
}
