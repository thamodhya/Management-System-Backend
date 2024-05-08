package com.example.Student_Management_System.controller;

import com.example.Student_Management_System.entity.OurUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import org.springframework.security.access.prepost.PreAuthorize;
import com.example.Student_Management_System.dto.ReqRes;
import com.example.Student_Management_System.entity.Student;
import com.example.Student_Management_System.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/{stud_id}")
    public Optional<Student> getStudentById(@PathVariable int stud_id){
        return studentService.getStudentById(stud_id);
    }

    @PutMapping("/{stud_id}")
    public Student updateStudent(@PathVariable int stud_id, @RequestBody Student student){
        return studentService.updateStudent(stud_id,student);
    }

    @DeleteMapping("/{stud_id}")
    public void deleteStudent(@PathVariable int stud_id){
        studentService.deleteStudent(stud_id);
    }
}


