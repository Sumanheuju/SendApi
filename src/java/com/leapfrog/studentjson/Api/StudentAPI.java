/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentjson.Api;

import com.leapfrog.studentjson.DAO.StudentDAO;
import com.leapfrog.studentjson.DAO.StudentDAOImpl;
import com.leapfrog.studentjson.entity.Student;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 * REST Web Service
 *
 * @author Suman Heuju
 */
@Path("/student")
public class StudentAPI {
    
    StudentDAO stdDAO = new StudentDAOImpl();
    
    @Produces(value = MediaType.APPLICATION_JSON)
    @GET
    public List<Student> index(){
        return stdDAO.getAll();
    }   
}
