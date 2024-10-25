package com.storyin.learnSecurity.service;

import com.storyin.learnSecurity.entity.Users;
import com.storyin.learnSecurity.entity.UserPrincipal;
import com.storyin.learnSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = repo.findByUsername(username);
        if(user == null){
            System.out.println("User Not Found with username: " + username);
            throw new UsernameNotFoundException("User Not Found with username: " + username);
        };

        return new UserPrincipal(user);
    }
}
