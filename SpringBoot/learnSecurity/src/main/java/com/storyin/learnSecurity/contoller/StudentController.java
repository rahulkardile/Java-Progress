package com.storyin.learnSecurity.contoller;

import com.storyin.learnSecurity.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/st")
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Rahul", 99),
            new Student(2, "Anjali", 85),
            new Student(3, "Vikas", 92),
            new Student(4, "Priya", 88),
            new Student(5, "Arjun", 76),
            new Student(6, "Meera", 94),
            new Student(7, "Vivek", 81),
            new Student(8, "Sneha", 89)
    ));

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student st){
        students.add(st);
        return st;
    }

}
