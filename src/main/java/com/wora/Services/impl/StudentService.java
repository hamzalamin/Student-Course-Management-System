package com.wora.Services.impl;

import com.wora.Entities.Student;
import com.wora.Repositorys.IStudentRepository;
import com.wora.Services.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private final IStudentRepository repository;

    public StudentService(IStudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        repository.update(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        repository.delete(studentId);
    }

    @Override
    public Student getStudent(Long studentId) {
        return repository.findById(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}
