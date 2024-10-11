package com.rahulkardile.Ecommerce_Web.service;

import com.rahulkardile.Ecommerce_Web.model.Student;
import com.rahulkardile.Ecommerce_Web.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Student> GetAllStudent() {
        return repo.findAll();
    };

    public Student addStudent(Student student){
        return repo.save(student);
    }

    public Student updateStudent(Student student){
        return repo.save(student);
    }

    public void deleteStudent(int id){
        repo.deleteById(id);
    }

}
