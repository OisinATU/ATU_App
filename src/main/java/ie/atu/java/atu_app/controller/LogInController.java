package ie.atu.java.atu_app.controller;


import ie.atu.java.atu_app.service.LogInService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logIn")
public class LogInController {

    //I'm making instances of email and password for each user
    private final LogInService logInService;
    //Here I create a constructor of type LogInRequest which will only receive thi kind of data
    //The statement in curly braces is for assigning the data to the variable of my class
    public LogInController(LogInService logInService){
        this.logInService = logInService;
    }
    //Here I'm receiving the https requests from the user
    // and calling the function from my class to return the email
    @GetMapping("/email")
    public ResponseEntity<String> email(@RequestParam String email){
        //If statement to check whether the user has entered the email address
        if(email.isEmpty()){
            return ResponseEntity.badRequest().body("Please enter your email");
        }
        //If statement to check whether the user has entered the right email address
        //Checked by the data base?
        String result = logInService.email(email);
        return ResponseEntity.ok(result);
    }
    //Receiving https request for password from the user
    //Calling the function from my class and returning the value
    @GetMapping("/password")
    public ResponseEntity<String> password (@RequestParam String password){
        //Error handling for not password entered
        if(password.isEmpty()){
            return ResponseEntity.badRequest().body("Please enter your password");
        }
        //Need to add a way to check the password for each user
        String result = logInService.password(password);
        return ResponseEntity.ok(result);
    }
}