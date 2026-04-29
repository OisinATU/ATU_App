package ie.atu.java.atu_app_dashboard.client;

import ie.atu.java.atu_app_dashboard.model.StudySession;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "study-service", url = "http://localhost:8080/api/study")
public interface StudyClient {

    @GetMapping("/sessions")
    List<StudySession> getAllSessions();
}
