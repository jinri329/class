package com.zyy.dao;

import java.util.List;

import com.zyy.bean.Items;

public interface ItemDao {
	List<Items> findItemsAll();
}
