package ie.atu.java.atu_app.repository;

import ie.atu.java.atu_app.entity.StudySession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudySessionRepo extends JpaRepository<StudySession, Long> {
}
