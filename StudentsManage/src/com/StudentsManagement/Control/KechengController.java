package com.StudentsManagement.Control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.StudentsManagement.Service.KechengSerivce;
import com.StudentsManagement.entity.Kecheng;

@Controller
@RequestMapping("Kecheng")
public class KechengController {
	@Autowired
	private KechengSerivce kechengSerivce;

	// É¾³ý¿Î³Ì
	@RequestMapping(value = "kechengDel.do", method = RequestMethod.GET)
	public String DelKecheng(int id, HttpSession session) {
		kechengSerivce.KechengDel(id);
		List<Kecheng> kechenglist = kechengSerivce.getAllKecheng();
		if (kechenglist != null) {
			session.setAttribute("kechenglist", kechenglist);
		}
		return "KechengDelSuccess";

	}

	// Ìí¼Ó¿Î³Ì
	@RequestMapping(value = "kechengAdd.do", method = RequestMethod.POST)
	public String kechengAdd(Kecheng kc, HttpSession session) {
		kechengSerivce.KechengAdd(kc);
		List<Kecheng> kechenglist = kechengSerivce.getAllKecheng();
		if (kechenglist != null) {
			session.setAttribute("kechenglist", kechenglist);
		}
		return "KechengAddSuccess";
	}
}
