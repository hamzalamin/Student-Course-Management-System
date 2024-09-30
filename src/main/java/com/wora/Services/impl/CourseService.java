package com.wora.Services.impl;

import com.wora.Entities.Course;
import com.wora.Repositorys.ICourseRepository;
import com.wora.Services.ICourseService;

import java.util.List;

public class CourseService implements ICourseService {
    private final ICourseRepository repository;

    public CourseService(ICourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addCourse(Course course) {
        repository.save(course);
    }

    @Override
    public void updateCourse(Course course) {
        repository.update(course);
    }

    @Override
    public void deleteCourse(Long courseId) {
        repository.delete(courseId);
    }

    @Override
    public Course getCourse(Long courseId) {
        return repository.findById(courseId);
    }

    @Override
    public List<Course> getAllCourses() {
        return repository.findAll();
    }
}
