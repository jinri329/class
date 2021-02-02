package com.zyy.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 商品项
 *
 */
public class TbItemParamKey implements Serializable{
	private Integer id;
	private String paramName;
	private Integer groupId;
	private TbItemParamGroup group;
	
	public TbItemParamGroup getGroup() {
		return group;
	}
	public void setGroup(TbItemParamGroup group) {
		this.group = group;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	@Override
	public String toString() {
		return "TbItemParamKey [id=" + id + ", paramName=" + paramName  + "]";
	}
	
	
	
}
