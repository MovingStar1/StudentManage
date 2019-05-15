package com.StudentsManagement.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.StudentsManagement.entity.Teacher;

public interface TeacherService {
	// 老师登陆
	Teacher TeacherLogin(@Param("loginname") String loginname,
			@Param("loginpw") String loginpw);

	// 获取所有老师
	List<Teacher> getAllTeachers();

	// 添加老师
	void AddTeacher(Teacher teacher);

	// 删除老师
	void DelTeacher(Integer id);
}
