package com.zyy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.zyy.bean.Items;
import com.zyy.bean.User;
import com.zyy.service.ItemService;
import com.zyy.vo.ItemResult;

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
	/**
	 * 
	 * 页面传递过来的是json格式的数据
	 * 必须用对象来接受
	 * 所以这个对象里面有这个对应的属性 就可以接收
	 * 那么响应也需要用对象来响应数据
	 * springmvc的返回类型
	 * 	1 modelandview 很少用 
	 * 2 string 跳转页面 有前提存在
	 * 3 返回对象类型 有前提存在
	 * 
	 * 只要有“响应主体”注解后
	 * 不管是string还是对象类型
	 * 都以json数据格式返回页面上
	 * 但是起作用要依赖jacksonjar包
	 * 
	 */
	@RequestMapping("/checkData")
	@ResponseBody
	public ItemResult checkData(@RequestBody User user) {
		ItemResult result = is.checkData(user);
		System.out.println(user);
		return result;
	}
	@RequestMapping("/delAll")
	public void delAll(@RequestBody List<User> user) {
		System.out.println(1);
	}
}
