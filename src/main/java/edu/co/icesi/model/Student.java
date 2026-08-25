package edu.co.icesi.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String code;
    //Example: A00123456

    private String name;

    private String program;

    private List<Course> courses;

    public Student() {
        this.courses = new ArrayList<>();
    }

    public Student(String code, String name, String program) {
        this.code = code;
        this.name = name;
        this.program = program;
        this.courses = new ArrayList<>();
    }

    public Student(String code, String name, String program, List<Course> courses) {
        this.code = code;
        this.name = name;
        this.program = program;
        this.courses = courses != null ? courses : new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return code + " - " + name + " (" + program + ")";
    }
}
