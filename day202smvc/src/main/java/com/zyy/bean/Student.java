package com.zyy.bean;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String name;
	private int age;
	private int sex;
	
	public Student() {
		
	}
	public Student(int id, String name, int age, int sex) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}
