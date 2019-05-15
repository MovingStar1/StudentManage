package com.StudentsManagement.Control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.StudentsManagement.Service.ManagerService;
import com.StudentsManagement.entity.Manager;

@Controller
@RequestMapping("Manager")
public class ManagerController {
	@Autowired
	private ManagerService managerService;

	// 添加管理员
	@RequestMapping(value = "AddManager.do", method = RequestMethod.POST)
	public String AddManager(Manager manager, HttpSession session) {
		managerService.AddManager(manager);
		List<Manager> list = managerService.getAllManager();
		if (list != null) {
			session.setAttribute("adminList", list);
		}
		return "adminAddSuccess";
	}

	// 获取所有管理员信息
	@RequestMapping(value = "getAllManager.do", method = RequestMethod.POST)
	public ModelAndView getAllManager(HttpSession session, ModelAndView mv) {
		List<Manager> list = managerService.getAllManager();
		if (list != null) {
			session.setAttribute("adminList", list);
			mv.setViewName("../admin/index");
		}
		return mv;

	}

	// 删除管理员
	@RequestMapping(value = "DelManager.do", method = RequestMethod.GET)
	public String DelManager(Integer id, HttpServletRequest request,
			HttpSession session) {
		String cid = request.getParameter("userId");
		id = Integer.parseInt(cid);
		System.out.println(id);
		managerService.DelManager(id);
		List<Manager> list = managerService.getAllManager();
		if (list != null) {
			session.setAttribute("adminList", list);
		}
		return "adminDelSuccess";

	}

	// 更新管理员密码
	@RequestMapping(value = "ManagerPwUpdate.do", method = RequestMethod.POST)
	public String ManagerPwUpdate(Manager manager, HttpServletRequest request) {
		String userpwd = request.getParameter("userPw1");
		String userName = request.getParameter("userName");
		manager.setUserName(userName);
		manager.setUserPw(userpwd);
		System.out.println(userpwd + "," + userName);
		managerService.ManagerPwUpdate(manager);
		return "adminPwUpdateSuccess";
	}
	
	//test
	@RequestMapping(value ="test.do")
	@ResponseBody
	public List<Manager> getManagerList(){
		List<Manager> managerlist=managerService.getAllManager();
		return managerlist;
		
	}
}
