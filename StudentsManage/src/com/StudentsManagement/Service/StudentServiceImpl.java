package com.StudentsManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagement.dao.StudentMapper;
import com.StudentsManagement.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public Student StudentLogin(String loginname, String loginpw) {
		// TODO Auto-generated method stub
		return studentMapper.UserLogin(loginname, loginpw);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentMapper.getAllStudents();
	}

	@Override
	public void StudentDel(Integer id) {
		// TODO Auto-generated method stub
		studentMapper.DelStudent(id);

	}

	@Override
	public void AddStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.AddStudent(student);

	}

	@Override
	public void Xuanke(Integer xuesheng_id, Integer kebiao_id) {
		// TODO Auto-generated method stub
		studentMapper.Xuanke(xuesheng_id, kebiao_id);
		
	}



}
