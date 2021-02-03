package com.zyy.service;

import java.util.List;
import com.zyy.bean.Items;


public interface ItemService {
	/**
	 * 查询所有商品信息
	 * @return
	 */
	List<Items> findItemsAll();
}
