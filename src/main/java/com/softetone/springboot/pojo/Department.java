package com.softetone.springboot.pojo;

import java.io.Serializable;

/**
 *@date 2018年5月14日-下午1:52:00
 *@author fu yanliang
 *项目名：springboot
 *文件名：Department.java
 *@action(作用)
 *@instruction
 */
public class Department implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2216766499869614439L;

	private Integer id;
	
	private String name;
	
	private String descr;
	
	public Department() {

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

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
}
