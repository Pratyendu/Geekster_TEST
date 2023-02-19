package com.test.ecommerce.service;

import com.test.ecommerce.model.User;
import com.test.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public int createUser(User newUser){
        userRepository.save(newUser);
        return newUser.getUserId();
    }

    public User getUserById(int userId){
       return userRepository.findById(userId).get();
    }
}
