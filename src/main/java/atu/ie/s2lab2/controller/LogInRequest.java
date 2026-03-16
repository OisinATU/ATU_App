package atu.ie.s2lab2.controller;

import atu.ie.s2lab2.module.UserLogIn;
import atu.ie.s2lab2.service.LogInService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logIn")
public class LogInRequest {
    //Here I'm receiving the https requests from the user
    private final LogInService logInService;
    //Here I create a constructor of type LogInRequest which will only receive thi kind of data
    //The statement in curly braces is for assigning the data to the variable of my class
    public LogInRequest(LogInService logInService){
        this.logInService = logInService;
    }
    //I'm making instances of email and password for each user
    @PostMapping("/addUser")
    public ResponseEntity<UserLogIn> addUser(@Valid @RequestBody UserLogIn user){
        UserLogIn saved = logInService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
    //Here I'm returning all the users that have logged in
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserLogIn>> getAllUsers(){
        return ResponseEntity.ok(logInService.getAllUsers());
    }
}

