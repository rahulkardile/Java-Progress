package com.storyin.journalApp.service;

import com.storyin.journalApp.entity.JournalEntry;
import com.storyin.journalApp.entity.UserEntity;
import com.storyin.journalApp.repository.UserRepo;
import org.apache.catalina.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<UserEntity> getAll(){
        return userRepo.findAll();
    }

    public void saveEntry(UserEntity userEntity){
        userRepo.save(userEntity);
    }

    public Optional<UserEntity> getById(ObjectId id){
        return userRepo.findById(id);
    }

    public UserEntity findByUsername(String userName){
        return userRepo.findByUsername(userName);
    }

    public boolean deleteById(ObjectId id){
        userRepo.deleteById(id);
        return true;
    }

}
