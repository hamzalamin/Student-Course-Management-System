package com.wora.Services;

import com.wora.Entities.StudentsCourse;

import java.util.List;

public interface IStudentsCourseService {
    void enrollStudentInCourse(StudentsCourse studentCourse);
    void removeStudentFromCourse(Long studentCourseId);
    List<StudentsCourse> getAllEnrollments();
    StudentsCourse getEnrollment(Long studentCourseId);
}
