package ie.atu.java.atu_app.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private LocalDateTime createdAt;


    private List<Subject> subjects = new ArrayList<>();


    private List<StudySession> studySessions = new ArrayList<>();


    public Student() {
    }

    public Student(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.createdAt = LocalDateTime.now();
    }


    // Need to understand these
    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public void addStudySession(StudySession session) {
        this.studySessions.add(session);
    }


}

