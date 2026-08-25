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
        // Queremos que se guarde el estudiante en su repositorio y todos sus cursos en otro repositorio
        // Separamos los elementos a la entrada y guardamos cada objeto en su lugar
        if (student.getCourses() != null) {
            for (Course course : student.getCourses()) {
                courseRepository.save(course);
            }
        }
        students.add(student);
    }
}
