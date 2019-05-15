package com.StudentsManagement.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.StudentsManagement.entity.Student;

public interface StudentService {
	// 学生登陆
	Student StudentLogin(@Param("loginname") String loginname,
			@Param("loginpw") String loginpw);

	// 获取所有学生
	List<Student> getAllStudents();

	// 选课
	void Xuanke(Integer xuesheng_id, Integer kebiao_id);


	// 删除学生
	void StudentDel(Integer id);

	// 添加学生
	void AddStudent(Student student);
}
