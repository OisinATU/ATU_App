package ie.atu.java.atu_app.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/study")
public class StudyController {


    @PostMapping("/sessions")
    public ResponseEntity<?> createSession(@RequestParam String subject, @RequestParam int time) {

    }


    @GetMapping("/totals")


}
