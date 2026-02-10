package atu.ie.s2lab2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    /* I need to send 2 pieces of information.
    * I need to ask for the user email address and password
    * Here I'm going to receive the https requests*/

    @GetMapping("/get/{email}")
    public String getEmail(@PathVariable String email){
        return email;
    }
    @GetMapping("/get/{password}")
    public String getPassword(String password){
        return password;
    }

}
