package com.woniu.service;

import com.woniu.service.impl.CourseServiceImpl;
import com.woniu.service.impl.StudentServiceImpl;
import com.woniu.service.impl.TeacherServiceImpl;

public class ServiceFactory {

	public static IStudentService getStudentService(){
		return new StudentServiceImpl();
	}
	
	public static ITeacherService getTeacherService(){
		return new TeacherServiceImpl();
	}
	
	public static ICourseService getCourseImpl(){
		return new CourseServiceImpl();
	}
}
