package com.zyy.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.zyy.bean.Items;
import com.zyy.bean.User;
import com.zyy.vo.ItemResult;


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
	/**
	 * 
	 * @param user
	 * @return 校验用户名是否存在
	 * 不存在返回200 可用
	 * 存在返回500 不可用
	 */
	ItemResult checkData(User user);
}
