package ie.atu.java.atu_app.service;



import ie.atu.java.atu_app.entity.StudySession;
import ie.atu.java.atu_app.exception.InvalidStudySessionException;
import ie.atu.java.atu_app.exception.StudySessionNotFoundException;
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
        if (session.getDurationMinutes() <= 0) {
            throw new InvalidStudySessionException("Study time must be greater than zero");
        }

        if (session.getSubject() == null || session.getSubject().isBlank()) {
            throw new InvalidStudySessionException("Subject is required");
        }

        return studySessionRepo.save(session);
    }

    public List<StudySession> getAllSessions() {
        return studySessionRepo.findAll();
    }

    public StudySession getSessionById(Long id) {
        return studySessionRepo.findById(id)
                .orElseThrow(() -> new StudySessionNotFoundException("Study session not found"));
    }

    public void deleteSession(Long id) {
        if (!studySessionRepo.existsById(id)) {
            throw new StudySessionNotFoundException("Study session not found");
        }

        studySessionRepo.deleteById(id);
    }

}
