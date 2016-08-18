/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentjson.DAO;

import com.leapfrog.studentjson.entity.Student;
import java.util.List;

/**
 *
 * @author Suman Heuju
 */
public interface StudentDAO {
    List<Student> getAll();
    int insert(Student s);
}
