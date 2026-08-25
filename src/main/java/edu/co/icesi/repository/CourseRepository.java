package edu.co.icesi.repository;

import edu.co.icesi.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private List<Course> courses = new ArrayList<>();

    public List<Course> findAll() {
        return courses;
    }

    public void save(Course course) {
        courses.add(course);
    }
}
