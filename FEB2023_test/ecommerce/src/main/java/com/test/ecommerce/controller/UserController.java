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
        userService.createUser(user);
        return new ResponseEntity("User Created" , HttpStatus.CREATED);
    }

    @GetMapping("get-user-by-id/{userId}")
    public ResponseEntity<String> getUserById(@PathVariable int userId){
        userService.getUserById(userId);
        return new ResponseEntity("User Fetched with id :" + userId , HttpStatus.FOUND);
    }

}
