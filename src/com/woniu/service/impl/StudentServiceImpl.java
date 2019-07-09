package com.woniu.service.impl;

import java.util.List;

import com.woniu.dao.DaoFactory;
import com.woniu.po.Student;
import com.woniu.service.IStudentService;

public class StudentServiceImpl implements IStudentService {

	@Override
	public List<Student> findAllStu() {
		// TODO Auto-generated method stub
		return DaoFactory.getStudentDao().findAll();
	}

	@Override
	public void deleteStu(int sid) {
		// TODO Auto-generated method stub
		DaoFactory.getStudentDao().delete(sid);
	}

	@Override
	public void add(Student stu) {
		// TODO Auto-generated method stub
		DaoFactory.getStudentDao().save(stu);
	}

	@Override
	public Student getStu(int sid) {
		// TODO Auto-generated method stub
		return DaoFactory.getStudentDao().findOne(sid);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		DaoFactory.getStudentDao().update(student);
	}


}
