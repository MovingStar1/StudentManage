package com.StudentsManagement.Control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.StudentsManagement.Service.TeacherService;
import com.StudentsManagement.entity.Teacher;

@Controller
@RequestMapping("Teacher")
public class TeacherController {
	@Autowired
	private TeacherService teacherService;

	// 删除老师
	@RequestMapping(value = "TeacherDel.do", method = RequestMethod.GET)
	public String TeacherDel(Integer id, HttpSession session) {
		teacherService.DelTeacher(id);
		List<Teacher> teacherlist = teacherService.getAllTeachers();
		if (teacherlist != null) {
			session.setAttribute("teacherlist", teacherlist);
		}
		return "TeacherDelSuccess";

	}

	// 添加老师
	@RequestMapping(value = "TeacherAdd.do", method = RequestMethod.POST)
	public String TeacherAdd(Teacher teacher, HttpSession session) {
		teacherService.AddTeacher(teacher);
		List<Teacher> teacherlist = teacherService.getAllTeachers();
		if (teacherlist != null) {
			session.setAttribute("teacherlist", teacherlist);
		}
		return "TeacherAddSuccess";

	}
}
