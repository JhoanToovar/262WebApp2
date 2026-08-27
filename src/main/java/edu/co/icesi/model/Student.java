package edu.co.icesi.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Student {

    private int id;
    private String code;
    //Example: A00123456
    private String name;
    private String program;
    //llave foranea de course para evitar relaciones sin quitar dependencias
    private int courseId;

    public Student() {}

    public Student(int id, String code, String name, String program, int courseId) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.program = program;
        this.courseId = courseId;
    }


    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
