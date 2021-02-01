package com.zyy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyy.bean.Student;
import com.zyy.dao.StudentDao;
import com.zyy.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;
	@Override
	public List<Student> findStudentAll() {
		List<Student> list = studentDao.findStudentAll();
		return list;
	}

	@Override
	public List<Student> findOneStudent(Integer id) {
		List<Student> student = studentDao.findOneStudent(id);
		return student;
	}

	@Override
	public void addStudent(Student s) {
		int i = studentDao.addStudent(s);
		System.out.println(i);
	}

	@Override
	public void delStudent(Integer id) {
		int i= studentDao.delStudent(id);
		System.out.println(i);
	}

	@Override
	public void updateStudent(Student s) {
		int i = studentDao.updateStudent(s);
		System.out.println(i);
	}

	@Override
	public List<Student> findLikeByName(String name) {
		List<Student> list = studentDao.findLikeByName(name);
		return list;
	}

	@Override
	public List<Student> findStudentBySearch(Student s) {
		List<Student> list = studentDao.findStudentBySearch(s);
		return list;
	}

	@Override
	public void delStudentById(List<Integer> ids) {
		int i = studentDao.delStudentById(ids);
		System.out.println(i);
	}
	
}
