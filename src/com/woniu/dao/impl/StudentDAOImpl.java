package com.woniu.dao.impl;

import java.util.List;

import com.woniu.dao.IStudentDAO;
import com.woniu.po.Student;
import com.woniu.utils.BaseDAO;

public class StudentDAOImpl implements IStudentDAO {
   BaseDAO<Student> bd=new BaseDAO<Student>();
	@Override
	public void save(Student student) {
		String sql="insert into student values(null,?)";
		Object [] objs={student.getSname()};
		bd.update(sql, objs);
	}

	@Override
	public void delete(int sid) {
		String sql="delete from student where sid=?";
		Object [] objs={sid};
		bd.update(sql, objs);
	}

	@Override
	public void update(Student student) {
		String sql="update student set sname=? where sid=?";
        Object [] objs={student.getSname(),student.getSid()};
        bd.update(sql, objs);
	}

	@Override
	public Student findOne(int sid) {
		String sql="select * from where sid=?";
		Object[] objs={sid};
		List<Student> students=bd.select(sql, objs, Student.class);
		return students.size()==0?null:students.get(0);
	}

	@Override
	public List<Student> findAll() {
		String sql="select * from student";
		Object[] objs={};
		List<Student> students=bd.select(sql, objs, Student.class);
		return students;
	}

}
