package com.zyy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zyy.bean.Student;

@Controller
public class HelloController {
	
	/**
	 * 假设用户的请求地址为
	 * 	http://localhost:8080/item/showIndex.action
	 * 就进入这个方法
	 */
	@RequestMapping("/item/showIndex")
	public ModelAndView showIndex() {
		/**
		 * ModelAndView
		 * model 数据 传递给页面的数据就放这里
		 * view 视图 你要跳转到哪个页面 就放在这里
		 */
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1,"zyy",22,1);
		Student s2 = new Student(2,"wcy",22,1);
		Student s3 = new Student(3,"jxc",38,1);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for (Student student : list) {
			System.out.println(list);
		}
		ModelAndView mav = new ModelAndView();
		//这个方法类似于jsp servlet 的三大域对象一样 存入键值对
		mav.addObject("list",list);
		mav.setViewName("/list.jsp");
		return mav;
	}
}
