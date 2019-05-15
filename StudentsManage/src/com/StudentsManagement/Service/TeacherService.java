package com.StudentsManagement.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.StudentsManagement.entity.Teacher;

public interface TeacherService {
	// ��ʦ��½
	Teacher TeacherLogin(@Param("loginname") String loginname,
			@Param("loginpw") String loginpw);

	// ��ȡ������ʦ
	List<Teacher> getAllTeachers();

	// �����ʦ
	void AddTeacher(Teacher teacher);

	// ɾ����ʦ
	void DelTeacher(Integer id);
}
