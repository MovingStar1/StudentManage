package com.StudentsManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagement.dao.TeacherMapper;
import com.StudentsManagement.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;

	@Override
	public Teacher TeacherLogin(String loginname, String loginpw) {
		// TODO Auto-generated method stub
		return teacherMapper.TeacherLogin(loginname, loginpw);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherMapper.getAllTeachers();
	}

	@Override
	public void AddTeacher(Teacher teacher) {
		teacherMapper.AddTeacher(teacher);
	}

	@Override
	public void DelTeacher(Integer id) {
		// TODO Auto-generated method stub
		teacherMapper.DelTeacher(id);
	}

}
