package edu.co.icesi.service;

import edu.co.icesi.model.Course;
import edu.co.icesi.repository.CourseRepository;

import java.util.List;

public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }
}
