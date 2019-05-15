package com.StudentsManagement.Control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.StudentsManagement.Service.KebiaoService;
import com.StudentsManagement.Service.KechengServiceImpl;
import com.StudentsManagement.Service.ManagerService;
import com.StudentsManagement.Service.StudentService;
import com.StudentsManagement.Service.TeacherService;
import com.StudentsManagement.entity.Kebiao;
import com.StudentsManagement.entity.Kecheng;
import com.StudentsManagement.entity.Manager;
import com.StudentsManagement.entity.Student;
import com.StudentsManagement.entity.Teacher;

@Controller
@RequestMapping("LoginCheack")
public class AllLoginController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private ManagerService managerService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private KebiaoService kebiaoService;
	@Autowired
	private KechengServiceImpl kechengService;

	@RequestMapping(value = "AllLogin.do", method = RequestMethod.POST)
	public ModelAndView UserLogin(@Param("loginname") String loginname,
			@Param("loginpw") String loginpw, HttpSession session,
			ModelAndView mv, HttpServletRequest request) {
		String userType = request.getParameter("userType");
		if (userType.equals("0")) {
			Manager ma = managerService.ManagerLogin(loginname, loginpw);
			if (ma != null) {
				List<Manager> list = managerService.getAllManager();
				if (list != null) {
					List<Kebiao> kebiaolist = kebiaoService.getAllKebiao();
					System.out.println("¿Î±í:++++++++++++" + kebiaolist);
					if (kebiaolist != null) {
						List<Kecheng> kechenglist = kechengService
								.getAllKecheng();
						if (kechenglist != null) {
							List<Teacher> teacherlist = teacherService
									.getAllTeachers();
							if (teacherlist != null) {
								List<Student> studentlist = studentService
										.getAllStudents();
								if (studentlist != null) {
									session.setAttribute("ma", ma);
									session.setAttribute("userType", userType);
									session.setAttribute("adminList", list);
									session.setAttribute("kebiaolist",
											kebiaolist);
									session.setAttribute("kechenglist",
											kechenglist);
									session.setAttribute("teacherlist",
											teacherlist);
									session.setAttribute("studentlist",
											studentlist);
									mv.setViewName("../admin/index");
								}
							}
						}
					}
				}

			} else {
				mv.setViewName("error");
			}
		} else if (userType.equals("1")) {
			Teacher tc = teacherService.TeacherLogin(loginname, loginpw);
			if (tc != null) {
				List<Kebiao> TeacherKebiaolist = kebiaoService
						.getKebiaoByTeacherID(tc.getId());
				if (TeacherKebiaolist != null) {
					session.setAttribute("userType", userType);
					session.setAttribute("laoshi", tc);
					session.setAttribute("TeacherKebiaolist", TeacherKebiaolist);
					mv.setViewName("../admin/index");
				}
			} else {
				mv.setViewName("error");
			}

		} else if (userType.equals("2")) {
			Student st = studentService.StudentLogin(loginname, loginpw);
			if (st != null) {
				List<Kebiao> kebiaolist = kebiaoService.getAllKebiao();
				List<Kebiao> StudentKebiaolist = kebiaoService
						.getKebiaoByStudentID(st.getId());
				System.out.println(StudentKebiaolist);
				if (StudentKebiaolist != null) {
					session.setAttribute("userType", userType);
					session.setAttribute("xuesheng", st);
					session.setAttribute("kebiaolist", kebiaolist);
					session.setAttribute("StudentKebiaolist", StudentKebiaolist);
					mv.setViewName("../admin/index");
				}
			} else {
				mv.setViewName("error");
			}

		}
		return mv;

	}

}
