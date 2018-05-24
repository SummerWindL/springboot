package com.softetone.springboot.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softetone.springboot.pojo.Role;


/**
 *@date 2018年5月13日-下午9:12:12
 *@author fu yanliang
 *项目名：springboot
 *文件名：RoleRepository.java
 *@action(作用)
 *@instruction
 */
public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findOne(int i);

	void delete(int i);

}