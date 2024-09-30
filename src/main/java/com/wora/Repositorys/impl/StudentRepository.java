package com.wora.Repositorys.impl;

import com.wora.Entities.Student;
import com.wora.Repositorys.IStudentRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final SessionFactory sessionFactory;
    public StudentRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }

    @Override
    public Student findById(Long id) {
        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }

    @Override
    public List<Student> findAll() {
        Session session = sessionFactory.openSession();
        List<Student> students = session.createQuery("FROM student" , Student.class).list();
        session.close();
        return students;
    }

    @Override
    public void update(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class, id);
        if(student != null){
            session.delete(student);
        }
        transaction.commit();
        session.close();
    }
}
