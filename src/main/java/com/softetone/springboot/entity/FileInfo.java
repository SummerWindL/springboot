package com.softetone.springboot.entity;
/**
 * 2018年4月26日-下午4:46:53
 * @author Administrator
 * TODO：用于封装文件上传返回的信息
 */
public class FileInfo {

	private String path;
	
	public FileInfo(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
