package com.lentra.SecurityApp.service;

import com.lentra.SecurityApp.entity.Users;
import com.lentra.SecurityApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    @Autowired
    private AuthenticationManager manager;
    @Autowired
    private JWTService jwtService;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public boolean createNewUser(Users user) {

        if (repo.findByUsername(user.getUsername( )) == null) {
            user.setPassword(encoder.encode(user.getPassword( )));
            repo.save(user);
            return true;
        } else {
            return false;
        }
    }

    public boolean loginUser(Users user) {
        Authentication authentication =
                manager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                user.getUsername( ), user.getPassword( )
                        ));
        if (authentication.isAuthenticated()){
            System.out.println(jwtService.generateToken(user.getUsername( )));
            return true;
        } else {
            return false;
        }
    }
}
