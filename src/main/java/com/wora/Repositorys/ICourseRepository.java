package com.wora.Repositorys;

import com.wora.Entities.Course;
import java.util.List;

public interface ICourseRepository {
    void save(Course course);
    Course findById(Long id);
    List<Course> findAll();
    void update(Course course);
    void delete(Long id);
}
