package com.zyy.vo;

import java.io.Serializable;

public class ItemResult implements Serializable{
	private Integer code;
	private String msg;
	private Object data;
	
	//调用ok就是返回的这个类的一个参数的构造方法
	public static ItemResult ok(Object data) {
		return new ItemResult(data);
	}
	//外界调用这个就会返回这个类的有参构造
	public static ItemResult build(Integer code,String msg,Object data) {
		return new ItemResult(code,msg,data);
	}
	
	public ItemResult() {
		super();
	}
	public ItemResult(Object data) {
		this.code = 200;
		this.msg = "ok";
		this.data = data;
	}
	public ItemResult(Integer code,String msg,Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ItemResult [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
	
}
