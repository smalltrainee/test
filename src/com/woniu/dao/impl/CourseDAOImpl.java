package com.woniu.dao.impl;

import java.util.List;

import com.woniu.dao.ICourseDAO;
import com.woniu.po.Course;
import com.woniu.utils.BaseDAO;

public class CourseDAOImpl implements ICourseDAO {
   BaseDAO<Course> bd=new BaseDAO<Course>();
	@Override
	public void save(Course co) {
		String sql="insert into course vlaues(null,?,?,?)";
        Object[] objs={co.getTid(),co.getSid(),co.getCname()};
        bd.update(sql, objs);
	}

	@Override
	public void update(Course co) {
       String sql="update course set tid=?,sid=?,cname=? where cid=?";
       Object[] objs={co.getTid(),co.getSid(),co.getCname(),co.getCid()};
       bd.update(sql, objs);
	}

	@Override
	public void delete(int cid) {
      String sql="delete from course where cid=?";
      Object[] objs={cid};
      bd.update(sql, objs);
	}

	@Override
	public Course finone(int cid) {
      String sql="select * from course where cid=?";
	  Object[]objs={cid};
	  List<Course> course=bd.select(sql, objs, Course.class)    ; 
      return course.size()==0?null:course.get(0);
	}

	@Override
	public List<Course> findall() {
	  String sql="select * from course";
	  Object[]objs={};
	  List<Course> course=bd.select(sql, objs, Course.class)  ;
		return course;
	}

}
