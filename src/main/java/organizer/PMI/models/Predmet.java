package organizer.PMI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "predmet")
public class Predmet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String classroom;
    private int day;
    private String type;
    private String prepod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrepod() {
        return prepod;
    }

    public void setPrepod(String prepod) {
        this.prepod = prepod;
    }

    public Predmet(Long id, String title, String classroom, int day, String type, String prepod) {
        this.id = id;
        this.title = title;
        this.classroom = classroom;
        this.day = day;
        this.type = type;
        this.prepod = prepod;
    }

    public Predmet() {
    }
}
