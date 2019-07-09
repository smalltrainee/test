package com.woniu.dao;

import java.util.List;

import com.woniu.po.Course;

public interface ICourseDAO {
     void save (Course co);
     void update(Course co);
     void delete(int cid);
     Course finone(int cid);
     List<Course> findall();
}
