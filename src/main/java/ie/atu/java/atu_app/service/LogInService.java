package ie.atu.java.atu_app.service;

import org.springframework.stereotype.Service;

@Service
public class LogInService {

    public String email(String userEmail){
        return userEmail;
    }
    public String password(String password){
        return password;
    }

}