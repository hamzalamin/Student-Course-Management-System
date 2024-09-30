package com.wora.Repositorys.impl;

import com.wora.Entities.StudentsCourse;
import com.wora.Repositorys.IStudentCourseRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StudentCourseRepository implements IStudentCourseRepository {
    private final SessionFactory sessionFactory;

    public StudentCourseRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void save(StudentsCourse studentCourse) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(studentCourse);
        transaction.commit();
        session.close();
    }

    @Override
    public StudentsCourse findById(Long id) {
        Session session = sessionFactory.openSession();
        StudentsCourse studentCourse = session.get(StudentsCourse.class, id);
        session.close();
        return studentCourse;
    }

    @Override
    public List<StudentsCourse> findAll() {
        Session session = sessionFactory.openSession();
        List<StudentsCourse> studentsCourse = session.createQuery("FROM StudentsCourse", StudentsCourse.class).list();
        session.close();
        return studentsCourse;
    }

    @Override
    public void update(StudentsCourse studentCourse) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(studentCourse);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        StudentsCourse studentsCourse = session.get(StudentsCourse.class, id);
        if (studentsCourse != null) {
            session.delete(studentsCourse);
        }
        transaction.commit();
        session.close();
    }
}
