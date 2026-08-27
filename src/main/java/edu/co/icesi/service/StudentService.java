package edu.co.icesi.service;

import edu.co.icesi.model.Student;
import edu.co.icesi.repository.CourseRepository;
import edu.co.icesi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service lo vuelve el bean
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    public StudentService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        //Solo puedo registrar al student si el curso existe

        if(courseRepository.existsById(student.getCourseId())){
            studentRepository.save(student);
            System.out.println("Student " +  student.getName() + " was added to the database");
        }else{
            System.out.println("Course not found");
        }

    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
