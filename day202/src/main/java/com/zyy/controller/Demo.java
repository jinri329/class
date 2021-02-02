package com.zyy.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zyy.bean.TbItemParamGroup;
import com.zyy.bean.TbItemParamKey;
import com.zyy.service.ItemService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:applicationContext.xml" }) 
public class Demo {
	@Autowired
	private ItemService is;
	@Test
	public void demo1() {
		TbItemParamGroup  list = is.findItemById(1);
		System.out.println(list);
		List<TbItemParamKey> key = list.getParamKey();
		for (TbItemParamKey tbItemParamKey : key) {
			System.out.println(tbItemParamKey);
		}
	}
}
