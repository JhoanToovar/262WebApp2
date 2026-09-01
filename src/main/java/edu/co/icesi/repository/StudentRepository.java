package edu.co.icesi.repository;

import edu.co.icesi.model.Course;
import edu.co.icesi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository lo vuelve un bean
@Repository
public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    //@Autowired es como la flecha de dependencia que indica que necesito esto para existir
    @Autowired
    private ICourseRepository courseRepository;

    public StudentRepository(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Student> findAll() {
        return students;
    }

    public void save(Student student) {
        students.add(student);
    }
}
