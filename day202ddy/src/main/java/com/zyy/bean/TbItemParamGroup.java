package com.zyy.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 商品组
 *
 */
public class TbItemParamGroup implements Serializable {
	private Integer id;
	private String groupName;
	private Long itemCatId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Long getItemCatId() {
		return itemCatId;
	}
	public void setItemCatId(Long itemCatId) {
		this.itemCatId = itemCatId;
	}
	//表与表之间的关系 对象与对象的关系不用表现在toString上
	@Override
	public String toString() {
		return "TbItemParamGroup [id=" + id + ", groupName=" + groupName + ", itemId=" + itemCatId + "]";
	}

	
	
}
