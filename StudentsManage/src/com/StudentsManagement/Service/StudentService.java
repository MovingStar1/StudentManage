package com.StudentsManagement.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.StudentsManagement.entity.Student;

public interface StudentService {
	// ѧ����½
	Student StudentLogin(@Param("loginname") String loginname,
			@Param("loginpw") String loginpw);

	// ��ȡ����ѧ��
	List<Student> getAllStudents();

	// ѡ��
	void Xuanke(Integer xuesheng_id, Integer kebiao_id);


	// ɾ��ѧ��
	void StudentDel(Integer id);

	// ���ѧ��
	void AddStudent(Student student);
}
