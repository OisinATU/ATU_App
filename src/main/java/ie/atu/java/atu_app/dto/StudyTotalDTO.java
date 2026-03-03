package ie.atu.java.atu_app.dto;


public class StudyTotalDTO {

    private String subject;
    private int totalMinutes;

    public StudyTotalDTO() {
    }

    public StudyTotalDTO(String subject, int totalMinutes) {
        this.subject = subject;
        this.totalMinutes = totalMinutes;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(int totalMinutes) {
        this.totalMinutes = totalMinutes;
    }
}
