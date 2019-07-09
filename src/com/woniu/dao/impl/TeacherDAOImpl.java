package com.woniu.dao.impl;

import java.util.List;

import com.woniu.dao.ITeacherDAO;
import com.woniu.po.Teacher;
import com.woniu.utils.BaseDAO;

public class TeacherDAOImpl implements ITeacherDAO {
		BaseDAO<Teacher> bd=new BaseDAO<Teacher>();
	@Override
	public void save(Teacher t) {
		String sql="insert into teacher values(null,?)";
        Object [] objs={t.getTname()};
        bd.update(sql, objs);
	}

	@Override
	public void update(Teacher t) {
		String sql="update teacher set tname=? where tid=?";
        Object [] objs={t.getTname(),t.getTid()};
        bd.update(sql, objs);
	}

	@Override
	public void delete(int tid) {
		String sql="delete from teacher where tid=?";
        Object[] objs={tid};
        bd.update(sql, objs);
	}

	@Override
	public Teacher findone(int tid) {
		String sql="select * from Teacher where tid=?"; 
		Object[] objs={tid};
		List<Teacher> teachers=bd.select(sql, objs, Teacher.class);
		return teachers.size()==0?null:teachers.get(0);
	}

	@Override
	public List<Teacher> findall() {
	    String sql="select * from Teacher";
	    Object [] objs={};
	    List<Teacher> teachers=bd.select(sql, objs, Teacher.class);
	    return teachers;
	}

}
