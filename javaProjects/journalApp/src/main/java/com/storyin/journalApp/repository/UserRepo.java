package com.storyin.journalApp.repository;

import com.storyin.journalApp.entity.UserEntity;
import org.apache.catalina.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserEntity, ObjectId> {
    UserEntity findByUsername(String username);
}
