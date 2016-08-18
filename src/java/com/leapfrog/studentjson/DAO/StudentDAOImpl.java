/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentjson.DAO;

import com.leapfrog.studentjson.entity.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Suman Heuju
 */
public class StudentDAOImpl implements StudentDAO {
    EntityManagerFactory factory; 
    EntityManager manager;

    public StudentDAOImpl() {
        factory = Persistence.createEntityManagerFactory("StudentJSONPU2");
        manager=factory.createEntityManager();
        
    }
    
    
    @Override
    public List<Student> getAll() {
        Query query = manager.createQuery("Select s from Student s");
        return (List<Student>)query.getResultList();
        
    }

    @Override
    public int insert(Student s) {
        EntityTransaction transaction = manager.getTransaction();
        if(!transaction.isActive()){
            transaction.begin();
        }
        manager.persist(s);
        manager.flush();
        transaction.commit();
        return s.getStudentId();
        
    }
    
}
