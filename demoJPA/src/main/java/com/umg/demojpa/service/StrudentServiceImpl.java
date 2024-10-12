package com.umg.demojpa.service;

import com.umg.demojpa.entity.Student;
import com.umg.demojpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StrudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudent(final int carne) {
        return studentRepository.findById(carne);
    }

    @Override
    public Student saveStudent(final Student newStudent){
        return studentRepository.save(newStudent);
    }

    @Override
    public void deleteStudent(final int carne) {
        studentRepository.deleteById(carne);
    }
}
