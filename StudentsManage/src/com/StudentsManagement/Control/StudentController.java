package com.StudentsManagement.Control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.StudentsManagement.Service.KebiaoService;
import com.StudentsManagement.Service.StudentService;
import com.StudentsManagement.entity.Kebiao;
import com.StudentsManagement.entity.Student;

@Controller
@RequestMapping("Student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private KebiaoService kebiaoService;

	// 删除学生
	@RequestMapping(value = "StudentDel.do", method = RequestMethod.GET)
	public String StudentDel(Integer id, HttpSession session) {
		studentService.StudentDel(id);
		List<Student> studentlist = studentService.getAllStudents();
		if (studentlist != null) {
			session.setAttribute("studentlist", studentlist);
		}
		return "StudentDelSuccess";

	}

	// 添加学生
	@RequestMapping(value = "StudentAdd.do", method = RequestMethod.POST)
	public String StudentAdd(Student student, HttpSession session) {
		studentService.AddStudent(student);
		List<Student> studentlist = studentService.getAllStudents();
		if (studentlist != null) {
			session.setAttribute("studentlist", studentlist);
		}
		return "StudentAddSuccess";

	}

	// 选课
	@RequestMapping(value = "xuanke.do", method = RequestMethod.GET)
	public String Xuanke(Integer xuesheng_id,Integer kebiao_id, HttpSession session) {
		System.out.println(kebiao_id);
		Student st=(Student) session.getAttribute("xuesheng");
		xuesheng_id=st.getId();
		System.out.println(xuesheng_id);
		studentService.Xuanke(xuesheng_id, kebiao_id);
		List<Kebiao> StudentKebiaolist=kebiaoService.getKebiaoByStudentID(xuesheng_id);
		if(StudentKebiaolist!=null){
			session.setAttribute("StudentKebiaolist", StudentKebiaolist);
		}
		return "XuankeSuccess";

	}

	
}
