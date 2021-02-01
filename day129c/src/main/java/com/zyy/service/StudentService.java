package com.zyy.service;

import java.util.List;

import com.zyy.bean.Student;

public interface StudentService {
	List<Student> findStudentAll();
	List<Student> findOneStudent(Integer id);
	void addStudent(Student s);
	void delStudent(Integer id);
	void updateStudent(Student s);
	
	//模糊查询
	List<Student> findLikeByName(String name);
	
	/**
	 * 动态查询 用户可以根据多个条件查询 
	 * 可以同时成立 可以同时不成立 可以只成立某些
	 */
	
	/**
	 * 
	 * @param s 需要查询的学生条件 可以没有 可以多个
	 * @return
	 */
	List<Student> findStudentBySearch(Student s);
	
	//根据id删除选中信息
	//如果传入的参数是集合时，使用注解来写更方便
	void delStudentById(List<Integer> ids);
}
