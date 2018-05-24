package com.softetone.springboot.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *@date 2018年5月13日-下午9:08:17
 *@author fu yanliang
 *项目名：springboot
 *文件名：Role.java
 *@action(作用)
 *@instruction
 */
@Entity
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6947775537936476829L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String descr;

	public Role() {

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
