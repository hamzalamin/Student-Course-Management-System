package com.wora.Services.impl;

import com.wora.Entities.StudentsCourse;
import com.wora.Repositorys.IStudentCourseRepository;
import com.wora.Services.IStudentsCourseService;

import java.util.List;

public class StudentsCourseService implements IStudentsCourseService {
    private final IStudentCourseRepository repository;

    public StudentsCourseService(IStudentCourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public void enrollStudentInCourse(StudentsCourse studentCourse) {
        repository.save(studentCourse);
    }

    @Override
    public void removeStudentFromCourse(Long studentCourseId) {
        repository.delete(studentCourseId);
    }

    @Override
    public List<StudentsCourse> getAllEnrollments() {
        return repository.findAll();
    }

    @Override
    public StudentsCourse getEnrollment(Long studentCourseId) {
        return repository.findById(studentCourseId);
    }
}
