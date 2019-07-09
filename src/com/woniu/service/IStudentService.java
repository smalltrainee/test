package com.woniu.service;

import java.util.List;

import com.woniu.po.Student;

public interface IStudentService {

	List<Student> findAllStu();

	void deleteStu(int sid);

	void add(Student stu);

	Student getStu(int sid);

	void update(Student student);
}
