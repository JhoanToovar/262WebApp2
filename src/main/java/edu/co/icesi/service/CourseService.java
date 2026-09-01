package edu.co.icesi.service;

import edu.co.icesi.model.Course;
import edu.co.icesi.repository.CourseRepositoryImpl;
import edu.co.icesi.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

//@Service lo vuelve el bean
@Service
public class CourseService {

    @Autowired
    @Qualifier("courseRepositoryImpl")
    private ICourseRepository courseRepository;

    public CourseService(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public Collection<Course> getCourses() {
        return courseRepository.findAll();
    }
}
