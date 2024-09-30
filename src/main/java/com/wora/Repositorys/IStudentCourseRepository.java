package com.wora.Repositorys;

import com.wora.Entities.StudentsCourse;

import java.util.List;

public interface IStudentCourseRepository {
    void save(StudentsCourse studentCourse);
    StudentsCourse findById(Long id);
    List<StudentsCourse> findAll();
    void update(StudentsCourse studentCourse);
    void delete(Long id);
}
