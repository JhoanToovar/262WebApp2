package edu.co.icesi.model;

public class Course {

    private int id;
    //Example: 35

    private String name;

    private String professorName;

    private String schedule;
    //Example: "MI 07:00 08:59, VI 15:00 16:59"

    public Course() {
    }

    public Course(int id, String name, String professorName, String schedule) {
        this.id = id;
        this.name = name;
        this.professorName = professorName;
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return name + " (" + id + ") - Prof. " + professorName + " - " + schedule;
    }
}
