package ie.atu.java.atu_app.service;



import ie.atu.java.atu_app.entity.StudySession;
import ie.atu.java.atu_app.repository.StudySessionRepo;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudyService {

    private final StudySessionRepo studySessionRepo;

    public StudyService(StudySessionRepo studySessionRepo) {
        this.studySessionRepo = studySessionRepo;
    }

    public StudySession addSession(StudySession session) {
        return studySessionRepo.save(session);
    }

    public List<StudySession> getAllSessions() {
        return studySessionRepo.findAll();
    }

}
