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
	

	private String dept_name;
	
	
	
	public Plan(Integer id, String name, BigDecimal amount, String manager, String content, Integer dept_id) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.manager = manager;
		this.content = content;
		this.dept_id = dept_id;
	}
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
	
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", amount=" + amount + ", manager=" + manager + ", content="
				+ content + ", dept_id=" + dept_id + "]";
	}
	
}
