package ie.atu.java.atu_app.dto;

public class StudySessionCreateDTO {

    private String subject;
    private int minutes;

    public StudySessionCreateDTO() {
    }

    public StudySessionCreateDTO(String subject, int minutes) {
        this.subject = subject;
        this.minutes = minutes;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}