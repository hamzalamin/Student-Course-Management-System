package com.wora.Services;

import com.wora.Entities.Course;

import java.util.List;

public interface ICourseService {
    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(Long courseId);
    Course getCourse(Long courseId);
    List<Course> getAllCourses();
}
