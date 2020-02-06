package com.zhangguoming.zhoukao.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Plan implements Serializable{
	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private BigDecimal amount;
	private String manager;
	private String content;
	private Integer dept_id;
	
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
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", amount=" + amount + ", manager=" + manager + ", content="
				+ content + ", dept_id=" + dept_id + "]";
	}
	
}
