package com.zyy.dao;

import java.util.List;

import com.zyy.bean.TbItemParamGroup;
import com.zyy.bean.TbItemParamKey;

public interface ItemDao {
	/**
	 * 
	 * @param id 通过商品id查找商品信息
	 * @return
	 */
	TbItemParamGroup findItemById(Integer id);

	TbItemParamKey findParamKeyById(Integer groupId);

}
