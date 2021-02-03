package com.zyy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
