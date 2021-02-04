package com.zyy.dao;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.zyy.bean.Items;

public interface ItemDao {
	List<Items> findItemsAll();

	Items findById(Integer id);

	int updateitem(Items items);
}
