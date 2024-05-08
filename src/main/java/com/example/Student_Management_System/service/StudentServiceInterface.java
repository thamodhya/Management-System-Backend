package com.example.Student_Management_System.service;

import java.util.List;
import java.util.Optional;

import com.example.Student_Management_System.entity.Student;

public interface StudentServiceInterface {
    public Student saveStudent(Student student);
    public Optional<Student> getStudentById(int stud_id);
    List<Student> getAllStudent();
    Student updateStudent(int stud_id, Student student);
    void deleteStudent(int stud_id);
}