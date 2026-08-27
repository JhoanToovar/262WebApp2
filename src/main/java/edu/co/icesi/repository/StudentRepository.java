package edu.co.icesi.repository;

import edu.co.icesi.model.Course;
import edu.co.icesi.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    private CourseRepository courseRepository;

    public StudentRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Student> findAll() {
        return students;
    }

    public void save(Student student) {
        students.add(student);
    }
}
