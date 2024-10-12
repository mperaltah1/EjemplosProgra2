package com.umg.demojpa.service;

import com.umg.demojpa.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    List<Student> getStudents();
    Optional<Student> getStudent(int carne);

    Student saveStudent(Student newStudent);

    void deleteStudent(int carne);
}
