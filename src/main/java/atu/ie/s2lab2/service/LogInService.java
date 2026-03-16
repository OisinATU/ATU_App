package atu.ie.s2lab2.service;

import atu.ie.s2lab2.module.UserLogIn;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Here I'm going to store the user log in in containers
@Service
public class LogInService {
    private final List<UserLogIn> users = new ArrayList<>();
    private long nextId = 1;

    public UserLogIn addUser(UserLogIn user){
        user.setId(nextId++);
        users.add(user);
        return user;
    }

    public List<UserLogIn> getAllUsers(){return users;}
}
