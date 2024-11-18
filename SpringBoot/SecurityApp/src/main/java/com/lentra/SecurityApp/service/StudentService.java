package com.lentra.SecurityApp.service;

import com.lentra.SecurityApp.entity.Users;
import com.lentra.SecurityApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private UserRepo repo;

    public List<Users> getAllUsers(){
        return repo.findAll();
    }

}
