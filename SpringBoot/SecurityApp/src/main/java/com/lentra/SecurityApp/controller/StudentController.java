package com.lentra.SecurityApp.controller;

import com.lentra.SecurityApp.entity.Student;
import com.lentra.SecurityApp.entity.Users;
import com.lentra.SecurityApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")  // Correct way to specify the path
public class StudentController {

    private List<Student> list = new ArrayList<>(List.of(
            new Student("rahul kardile", 22, 100),
            new Student("suraj mate", 22, 90),
            new Student("shubh sawai", 21, 80)
    ));

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Users> getStudent() {
        return service.getAllUsers();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        list.add(student);
        return student;
    }

}
