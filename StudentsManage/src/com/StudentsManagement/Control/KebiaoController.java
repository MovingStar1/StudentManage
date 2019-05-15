package com.StudentsManagement.Control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.StudentsManagement.Service.KebiaoService;
import com.StudentsManagement.entity.Kebiao;

@Controller
@RequestMapping("Kebiao")
public class KebiaoController {
	@Autowired
	private KebiaoService kebiaoService;

	// Ìí¼Ó¿Î±í
	@RequestMapping(value = "kebiaoAdd.do", method = RequestMethod.POST)
	public String kebiaoAdd(Kebiao kb, HttpSession session) {
		kebiaoService.AddKebiao(kb);
		List<Kebiao> list = kebiaoService.getAllKebiao();
		if (list != null) {
			session.setAttribute("kebiaolist", list);
		}
		return "KebiaoAddSuccess";
	}

	// É¾³ý¿Î±í
	@RequestMapping(value = "kebiaoDel.do", method = RequestMethod.GET)
	public String kebiaoDel(Integer id, HttpSession session) {
		kebiaoService.DelKebiao(id);
		List<Kebiao> list = kebiaoService.getAllKebiao();
		if (list != null) {
			session.setAttribute("kebiaolist", list);
		}
		return "KebiaoDelSuccess";

	}
	
}
