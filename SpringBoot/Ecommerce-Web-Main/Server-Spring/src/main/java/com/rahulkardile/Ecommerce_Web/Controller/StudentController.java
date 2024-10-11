package com.rahulkardile.Ecommerce_Web.Controller;

import com.rahulkardile.Ecommerce_Web.model.Student;
import com.rahulkardile.Ecommerce_Web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("")
    public ResponseEntity check(){
        return new ResponseEntity("Server is Working . . .", HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity allStudent(){
        return new ResponseEntity(service.GetAllStudent(), HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity postStudent(@RequestBody Student student){
        service.addStudent(student);
        return new ResponseEntity("Student Created!", HttpStatus.CREATED);
    }

    @PutMapping("/student")
    public ResponseEntity updateStudent(@RequestBody Student student){
        service.updateStudent(student);
        return new ResponseEntity("Student is updated", HttpStatus.OK);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
        return new ResponseEntity("Student Deleted", HttpStatus.OK);
    }

}
