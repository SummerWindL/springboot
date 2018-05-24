package com.softetone.springboot.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.druid.support.json.JSONUtils;
import com.softetone.springboot.dao.DepartmentMapper;
import com.softetone.springboot.pojo.Department;


/**
 *@date 2018年5月14日-下午1:53:53
 *@author fu yanliang
 *项目名：springboot
 *文件名：DepartmentTest.java
 *@action(作用)
 *@instruction
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentTest {

	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Test
	public void testInsert() {
		Department department = new Department();
		department.setId(3);
		department.setName("财务部");
		department.setDescr("财务统计");
		this.departmentMapper.insert(department);
	}
	
	@Test
	public void testGetById() {
		Department department = this.departmentMapper.getById(1);
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("1", Math.random());
		map.put("2", Math.random());
		map.put("3", Math.random());
		String json = JSONUtils.toJSONString(map);
		System.out.println(json);
	}
	
	@Test
	public void testGetAll() {
		List<Map<String, Object>> dlist = this.departmentMapper.getAllDepartment();
		String json = JSONUtils.toJSONString(dlist);
		System.out.println(json);
	}
	
	@Test
	public void testUpdate() {
		Department department = new Department();
		department.setId(1);
		department.setDescr("开发高级产品");
		this.departmentMapper.update(department);
	}
	
	@Test
	public void testDeleteById() {
		this.departmentMapper.deleteById(1);
	}
	
}
