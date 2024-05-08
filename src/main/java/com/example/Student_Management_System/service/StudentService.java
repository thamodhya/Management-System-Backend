package com.example.Student_Management_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.example.Student_Management_System.entity.Student;
import com.example.Student_Management_System.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceInterface {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(int stud_id) {
        return studentRepository.findById(stud_id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public Student updateStudent(int stud_id, Student student) {
        Student studentToUpdate = studentRepository.findById(stud_id).orElseThrow();
        studentToUpdate.setFirstName(student.getFirstName());
        studentToUpdate.setLastName(student.getLastName());
        studentToUpdate.setEmail(student.getEmail());
        return studentRepository.save(studentToUpdate);
    }

    @Override
    public void deleteStudent(int stud_id) {
        studentRepository.deleteById(stud_id);
    }
}

