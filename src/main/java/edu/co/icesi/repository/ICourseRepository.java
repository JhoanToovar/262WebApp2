package edu.co.icesi.repository;

import edu.co.icesi.model.Course;
import java.util.Collection;
public interface  ICourseRepository {
    Collection<Course> findAll();
    void save(Course course);
    boolean existsById(int id);
}
