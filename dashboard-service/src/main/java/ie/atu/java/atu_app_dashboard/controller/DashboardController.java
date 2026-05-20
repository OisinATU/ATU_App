package ie.atu.java.atu_app_dashboard.controller;


import ie.atu.java.atu_app_dashboard.client.StudyClient;
import ie.atu.java.atu_app_dashboard.model.StudySession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DashboardController {

    private final StudyClient studyClient;

    public DashboardController(StudyClient studyClient) {
        this.studyClient = studyClient;
    }

    @GetMapping("/dashboard/sessions")
    public List<StudySession> getSessions() {
        return studyClient.getAllSessions();
    }

    @GetMapping("/dashboard/total-minutes")
    public int getTotalMinutes() {
        List<StudySession> sessions = studyClient.getAllSessions();

        int total = 0;

        for (StudySession session : sessions) {
            total += session.getDurationMinutes();
        }

        return total;
    }
}