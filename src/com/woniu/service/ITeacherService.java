package com.woniu.service;

import java.util.List;

import com.woniu.po.Teacher;

public interface ITeacherService {
       void  add(Teacher t);
       void edit(Teacher t);
       void delete(int tid);
       Teacher findone(int tid);
       List<Teacher> findall();
}
