package com.StudentsManagement.Service;

import java.util.List;

import com.StudentsManagement.entity.Kecheng;

public interface KechengSerivce {
	// 获取所有课程
	List<Kecheng> getAllKecheng();

	// 删除课程
	void KechengDel(Integer id);

	// 添加课程
	void KechengAdd(Kecheng kc);
}
