package com.zyy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zyy.bean.TbItemParamGroup;
import com.zyy.bean.TbItemParamKey;
import com.zyy.dao.ItemDao;
import com.zyy.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;
	@Override
	public TbItemParamKey findParamKeyById(Integer groupId) {
		TbItemParamKey key =itemDao.findParamKeyById(groupId);
		return key;
	}


}
