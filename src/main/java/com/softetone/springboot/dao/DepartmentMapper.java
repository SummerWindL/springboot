package com.softetone.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.softetone.springboot.pojo.Department;

/**
 *@date 2018年5月14日-下午1:58:33
 *@author fu yanliang
 *项目名：springboot
 *文件名：DepartmentMapper.java
 *@action(作用)
 *@instruction
 */
@Mapper
public interface DepartmentMapper {

	public void insert(Department department);
	
	public Department getById(Integer id);
	
	public void update(Department department);
	
	public void deleteById(Integer id);
	
	public List<Map<String,Object>> getAllDepartment();
}
