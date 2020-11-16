package com.sunsoft;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/login")
	public String helloWorld(HttpServletRequest request,HttpServletResponse res,Model m) {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name="Goutham";
		String dept="IBGT";
		String desig="Senior Officer";
		if(password.equals("admin") && id.equals("1111")) {
			String message="You are a valid employss, Welcome "+id;
			m.addAttribute("message",message);
			m.addAttribute("id",id);
			m.addAttribute("name",name);
			m.addAttribute("dept",dept);
			m.addAttribute("desi",desig);
			return "login_success";
		}
		else {
			m.addAttribute("message","Sorry, username or password error");
			return "errorpage";
		}
	}
	

}
