package com.leapfrog.studentjson;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-16T15:36:22")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Integer> studentId;
    public static volatile SingularAttribute<Student, String> firstName;
    public static volatile SingularAttribute<Student, String> lastName;
    public static volatile SingularAttribute<Student, Date> addedDate;
    public static volatile SingularAttribute<Student, Date> modifiedDate;
    public static volatile SingularAttribute<Student, String> email;
    public static volatile SingularAttribute<Student, String> contactNo;
    public static volatile SingularAttribute<Student, Boolean> status;

}