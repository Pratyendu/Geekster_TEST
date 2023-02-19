package com.test.ecommerce.controller;

import com.test.ecommerce.model.User;
import com.test.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("create-user")
    public ResponseEntity<String> createUser(@RequestBody User user){
        int userId = userService.createUser(user);
        return new ResponseEntity("User Created with id :" + userId , HttpStatus.CREATED);
    }

    @GetMapping("get-user-by-id/{userId}")
    public User getUserById(@PathVariable int userId){
         return userService.getUserById(userId);

    }

}
