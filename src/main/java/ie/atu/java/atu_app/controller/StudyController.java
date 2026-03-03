package ie.atu.java.atu_app.controller;

import ie.atu.java.atu_app.dto.StudySessionCreateDTO;
import ie.atu.java.atu_app.dto.StudyTotalDTO;
import ie.atu.java.atu_app.service.StudyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/study")
public class StudyController {

    private final StudyService studyService;

    public StudyController(StudyService studyService) {
        this.studyService = studyService;
    }

    // POST /api/study/sessions
    @PostMapping("/sessions")
    public ResponseEntity<StudySessionCreateDTO> addSession(@RequestBody StudySessionCreateDTO dto) {
        StudySessionCreateDTO saved = studyService.addSession(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // GET /api/study/totals
    @GetMapping("/totals")
    public ResponseEntity<List<StudyTotalDTO>> getTotals() {
        return ResponseEntity.ok(studyService.getTotals());
    }
}
