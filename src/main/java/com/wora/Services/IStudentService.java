package com.wora.Services;

import com.wora.Entities.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Long studentId);
    Student getStudent(Long studentId);
    List<Student> getAllStudents();
}
