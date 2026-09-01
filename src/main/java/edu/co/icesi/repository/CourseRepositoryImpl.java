package edu.co.icesi.repository;

import edu.co.icesi.model.Course;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

//@Repository es lo que lo hace un bean

// -------- @Component se divide en alias : @Controller o @Service

@Repository
public class CourseRepositoryImpl implements ICourseRepository{

    private HashMap<Integer, Course> courses;

    public CourseRepositoryImpl() {
        courses = new HashMap<>();
    }
    @Override
    public Collection<Course> findAll() {
        return courses.values();
    }
    @Override
    public void save(Course course) {
        courses.put(course.getId(), course);
    }
    @Override
    public boolean existsById(int courseId) {
        return courses.containsKey(courseId);
    }

    @PostConstruct
    private void initialize() {
        Course a = new Course();
        a.setId(1);
        a.setName("Compunet 2");
        a.setSchedule("MA JU 2PM 4PM");
        a.setProfessorName("Domiciano");

        courses.put(a.getId(), a);

        Course b = new Course();
        b.setId(2);
        b.setName("Discretas 3");
        b.setSchedule("MA JU 4PM 6PM");
        b.setProfessorName("Marquitos");

        courses.put(b.getId(), b);

    }
}
