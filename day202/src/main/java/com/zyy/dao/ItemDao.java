package com.zyy.dao;

import java.util.List;

import com.zyy.bean.TbItemParamGroup;

public interface ItemDao {
	/**
	 * 
	 * @param id 通过商品id查找商品信息
	 * @return
	 */
	TbItemParamGroup findItemById(Integer id);

}
