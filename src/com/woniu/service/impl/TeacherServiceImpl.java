package com.woniu.service.impl;

import java.util.List;

import com.woniu.dao.DaoFactory;
import com.woniu.po.Teacher;
import com.woniu.service.ITeacherService;

public class TeacherServiceImpl implements ITeacherService {

	@Override
	public void add(Teacher t) {
		// TODO Auto-generated method stub
		DaoFactory.getTeacherDao().save(t);
	}

	@Override
	public void edit(Teacher t) {
		// TODO Auto-generated method stub
		DaoFactory.getTeacherDao().update(t);
	}

	@Override
	public void delete(int tid) {
		DaoFactory.getTeacherDao().delete(tid);
		
	}

	@Override
	public Teacher findone(int tid) {
		
		return DaoFactory.getTeacherDao().findone(tid);
	}

	@Override
	public List<Teacher> findall() {
		return DaoFactory.getTeacherDao().findall();
	}
               
}
