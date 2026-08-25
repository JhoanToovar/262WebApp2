package edu.co.icesi.service;

import edu.co.icesi.model.Student;
import edu.co.icesi.repository.StudentRepository;

import java.util.List;

public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
