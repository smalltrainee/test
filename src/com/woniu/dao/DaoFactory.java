package com.woniu.dao;

import com.woniu.dao.impl.CourseDAOImpl;
import com.woniu.dao.impl.StudentDAOImpl;
import com.woniu.dao.impl.TeacherDAOImpl;

public class DaoFactory {
     public static ICourseDAO getCourseDao(){
    	 return new  CourseDAOImpl();
     }
     public static IStudentDAO getStudentDao(){
    	 return new StudentDAOImpl();
     }
     public static ITeacherDAO getTeacherDao(){
    	 return new TeacherDAOImpl();
     }
}
