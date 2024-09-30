package com.wora.Repositorys.impl;

import com.wora.Entities.Course;
import com.wora.Repositorys.ICourseRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;

public class CourseRepository implements ICourseRepository {
    private final SessionFactory sessionFactory;

    public CourseRepository (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Course course) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(course);
        transaction.commit();
        session.close();
    }

    @Override
    public Course findById(Long id) {
        Session session = sessionFactory.openSession();
        Course course = session.get(Course.class, id);
        session.close();
        return course;
    }

    @Override
    public List<Course> findAll() {
        Session session = sessionFactory.openSession();
        List<Course> courses = session.createQuery("FROM Course", Course.class).list();
        session.close();
        return courses;
    }

    @Override
    public void update(Course course) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(course);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Course course = session.get(Course.class, id);
        if (course != null) {
            session.delete(course);
        }
        transaction.commit();
        session.close();
    }
}
