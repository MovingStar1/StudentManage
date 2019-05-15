package com.StudentsManagement.Service;

import java.util.List;

import com.StudentsManagement.entity.Kebiao;

public interface KebiaoService {
	// 获取所有课表
	List<Kebiao> getAllKebiao();

	// 添加课表
	void AddKebiao(Kebiao kb);

	// 删除课表
	void DelKebiao(Integer id);

	// 查找我的选课信息
	List<Kebiao> getKebiaoByStudentID(Integer id);

	// 获取老师的课程表信息
	List<Kebiao> getKebiaoByTeacherID(Integer id);


}
