package ie.atu.java.atu_app.service;



import ie.atu.java.atu_app.dto.StudySessionCreateDTO;
import ie.atu.java.atu_app.dto.StudyTotalDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudyService {

    // placeholder for database
    private final List<StudySessionCreateDTO> sessions = new ArrayList<>();

    public StudySessionCreateDTO addSession(StudySessionCreateDTO dto) {
        dto.setSubject(dto.getSubject().trim());
        sessions.add(dto);
        return dto;
    }

    public List<StudyTotalDTO> getTotals() {
        Map<String, Integer> totals = new HashMap<>();

        for (StudySessionCreateDTO s : sessions) {
            totals.merge(s.getSubject(), s.getMinutes(), Integer::sum);
        }

        List<StudyTotalDTO> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : totals.entrySet()) {
            result.add(new StudyTotalDTO(entry.getKey(), entry.getValue()));
        }

        result.sort(Comparator.comparing(StudyTotalDTO::getSubject, String.CASE_INSENSITIVE_ORDER));
        return result;
    }
}
