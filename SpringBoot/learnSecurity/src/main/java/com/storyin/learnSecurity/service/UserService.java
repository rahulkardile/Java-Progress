package com.storyin.learnSecurity.service;

import com.storyin.learnSecurity.entity.Users;
import com.storyin.learnSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    public Users save(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.save(user);
        return user;
    };

}
