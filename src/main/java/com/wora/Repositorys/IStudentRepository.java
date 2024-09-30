package com.wora.Repositorys;

import com.wora.Entities.Student;
import org.hibernate.sql.Update;

import java.util.List;

public interface IStudentRepository {
    void save(Student student);
    Student findById(Long id);
    List<Student> findAll();
    void update(Student student);
    void delete(Long id);
}
