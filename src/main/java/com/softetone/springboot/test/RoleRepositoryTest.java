package com.softetone.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.softetone.springboot.dao.repository.RoleRepository;
import com.softetone.springboot.pojo.Role;

/**
 *@date 2018年5月13日-下午10:31:09
 *@author fu yanliang
 *项目名：springboot
 *文件名：RoleRepositoryTest.java
 *@action(作用)
 *@instruction
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleRepositoryTest {

	@Autowired
	private RoleRepository roleRepository;
	
	@Test
	public void testInsert() {
		Role role = new Role();
		role.setName("管理员");
		role.setDescr("测试");
		Role result = this.roleRepository.save(role);
		System.out.println(result);
				
	}
	
	@Test
	public void testFindOne() {
		Role role = this.roleRepository.findOne(1);
		System.out.println(role.getName());
	}
	
	@Test
	public void testUpdate() {
		Role role = new Role();
		role.setId(1);
		role.setName("管理员");
		role.setDescr("控制权限");
		Role result = this.roleRepository.save(role);
		System.out.println(result.getId());
				
	}
	
	@Test
	public void testDelete() {
		this.roleRepository.delete(1);
	}
	
}
