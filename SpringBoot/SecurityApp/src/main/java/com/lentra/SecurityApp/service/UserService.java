package com.lentra.SecurityApp.service;

import com.lentra.SecurityApp.entity.Users;
import com.lentra.SecurityApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder( 12 );

    public boolean createNewUser(Users user){

        if(repo.findByUsername(user.getUsername()) == null){
            user.setPassword(encoder.encode(user.getPassword()));
            repo.save(user);
            return true;
        }else{
            return false;
        }

    }


}
