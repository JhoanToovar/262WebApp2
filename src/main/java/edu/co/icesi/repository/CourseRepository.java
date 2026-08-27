package edu.co.icesi.repository;

import edu.co.icesi.model.Course;

import java.util.Collection;
import java.util.HashMap;

public class CourseRepository {

    private HashMap<Integer, Course> courses;

    public CourseRepository() {
        courses = new HashMap<>();
    }

    public Collection<Course> findAll() {
        return courses.values();
    }

    public void save(Course course) {
        courses.put(course.getId(), course);
    }

    public boolean existsById(int courseId) {
        return courses.containsKey(courseId);
    }

    public void initialize() {
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
