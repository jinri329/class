package com.zyy.controller;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zyy.bean.Student;
import com.zyy.dao.StudentDao;
import com.zyy.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:applicationContext.xml" }) 
public class StudentController {
	@Autowired
	private StudentService ss;
	
	@Test
	public void all() {
		List<Student> list = ss.findStudentAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void one() {
		List<Student> list = ss.findOneStudent(6);
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void add() {
		Student s = new Student();
		s.setId(19);
		s.setName("shs");
		s.setAge(20);
		s.setSex(1);
		Date date = new Date();
		s.setTime(date);
		ss.addStudent(s);
	}
	@Test
	public void update() {
		Student s = new Student();
		s.setId(10);
		s.setName("abc");
		s.setAge(20);
		s.setSex(1);
		Date date = new Date();
		s.setTime(date);
		ss.updateStudent(s);
	}
	@Test
	public void del() {
		ss.delStudent(18);
	}
	
	@Test
	public void findLikeByName() {
		List<Student> list = ss.findLikeByName("s");
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void findLikeBySearch() {
		Student s = new Student();
		//当不传入参数的时候，是直接打印全部学生
		s.setName("s");
		s.setAge(22);
		List<Student> list = ss.findStudentBySearch(s);
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void delStudentById() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(21);
		list.add(10);
		ss.delStudentById(list);
	}
	
	
}
