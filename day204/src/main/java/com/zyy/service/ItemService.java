package com.zyy.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.zyy.bean.Items;


public interface ItemService {
	/**
	 * 查询所有商品信息
	 * @return
	 */
	List<Items> findItemsAll();

	/**
	 * 
	 * @param id
	 * @return 根据id查找商品
	 */
	Items findById(Integer id);

	/**
	 * 
	 * @param items
	 * @param picFile 
	 * @return 修改商品 修改成功>0 失败=0
	 */
	int updateitem(Items items, MultipartFile picFile);
}
