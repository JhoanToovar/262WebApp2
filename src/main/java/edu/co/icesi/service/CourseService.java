package edu.co.icesi.service;

import edu.co.icesi.model.Course;
import edu.co.icesi.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

//@Service lo vuelve el bean
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public Collection<Course> getCourses() {
        return courseRepository.findAll();
    }
}
