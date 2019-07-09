package com.woniu.dao;

import java.util.List;

import com.woniu.po.Teacher;

public interface ITeacherDAO {
   void save(Teacher t);
   void update (Teacher t);
   void delete (int tid);
   Teacher findone(int tid);
   List<Teacher> findall();
}
