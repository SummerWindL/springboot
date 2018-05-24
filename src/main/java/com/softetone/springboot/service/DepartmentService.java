package com.softetone.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.softetone.springboot.dao.DepartmentMapper;
import com.softetone.springboot.pojo.Department;

/**
 *@date 2018年5月14日-下午3:06:49
 *@author fu yanliang
 *项目名：springboot
 *文件名：DepartmentService.java
 *@action(作用)
 *@instruction
 */
@CacheConfig(cacheNames = "department")
@Service
public class DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;
	
	@CachePut(key = "#department.id")
	public Department save(Department department) {
		System.out.println("保存 id="+department.getId()+" 的数据");
		this.departmentMapper.insert(department);
		return department;
	}
	
	@CachePut(key = "#department.id")
	public Department update(Department department) {
		System.out.println("修改 id="+department.getId()+" 的数据");
		this.departmentMapper.update(department);
		return department;
	}
	
	@Cacheable(key = "#id")
	public Department getDepartmentById(Integer id) {
		System.out.println("获取 id="+id+" 的数据");
		Department department = this.departmentMapper.getById(id);
		return department;
	}
	
	@CacheEvict(key = "#id")
	public void delete(Integer id) {
		System.out.println("删除 id="+id+" 的数据");
		this.departmentMapper.deleteById(id);
	}
}
