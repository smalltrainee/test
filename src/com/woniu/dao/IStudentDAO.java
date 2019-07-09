package com.woniu.dao;

import java.util.List;

import com.woniu.po.Student;

public interface IStudentDAO {

	void save(Student student);
	void delete(int sid);
	void update(Student student);
	Student findOne(int sid);
	List<Student> findAll();
}
