package com.zyy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.zyy.bean.Items;
import com.zyy.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService is;
	
	
	@RequestMapping("/itemList")
	public ModelAndView showIndex() {
		List<Items> list = is.findItemsAll();
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemList", list);
		mav.setViewName("itemList");
		return mav;
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(Integer id,Model m) {
		System.out.println(id);
		Items items = is.findById(id);
		//这里的返回类型是string 就可以直接跳转页面
		m.addAttribute("item", items);
		return "editItem";
		
	}
	
	@RequestMapping("/updateitem")
	public String updateitem(Items items,MultipartFile picFile) {
		int i = is.updateitem(items,picFile);
		if(i>0) {
			//我们的跳转是跳转到controller
			//而不是跳转到页面
			//这里用重定向或者是请求转发跳转到页面
			//请求转发:forward:/....
			//重定向:redirect:/itemList.action
			return "redirect:/itemList.action";
		}
		return "forward:/showUpdate.action?id="+items.getId();
	}
	
}
