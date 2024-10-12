package com.umg.demojpa.controller;

import com.umg.demojpa.entity.Student;
import com.umg.demojpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public String getStudentsTable(Model model) {
        List<Student> students = studentService.getStudents();
        model.addAttribute("sList", students);
        return "estudiantes";
    }

    @PostMapping("/add")
    public String saveStudent(Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }

    @PostMapping("delete/{carne}")
    public String deleteStudent(@PathVariable Integer carne) {
        studentService.deleteStudent(carne);
        return "redirect:/";
    }
}
