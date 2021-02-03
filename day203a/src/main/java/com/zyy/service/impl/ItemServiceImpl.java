package com.zyy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyy.bean.Items;
import com.zyy.dao.ItemDao;
import com.zyy.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;
	@Override
	public List<Items> findItemsAll() {
		List<Items> list = itemDao.findItemsAll();
		return list;
	}

}
