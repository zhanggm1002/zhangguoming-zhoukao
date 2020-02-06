package com.zhangguoming.zhoukao.pojo;

import java.io.Serializable;

public class Department implements Serializable{
	
	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id   ;
	private String name ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	

}
