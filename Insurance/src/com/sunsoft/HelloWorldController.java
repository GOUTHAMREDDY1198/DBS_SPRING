package com.sunsoft;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	static ArrayList<Insurance> ins = new ArrayList<Insurance>();
	@RequestMapping("/add")
	public String addUser(HttpServletRequest request,HttpServletResponse res,Model m) {
		String name=request.getParameter("name");
		String policy=request.getParameter("policy");
		int cost=Integer.parseInt(request.getParameter("cost"));
		Insurance I = new Insurance(name,policy,cost);
		this.ins.add(I);
		return "adduser";
	}
	
	@RequestMapping("/sub")
	public String showUser() {
		for(int i=0;i<this.ins.size();i++) {
			System.out.println("Name is :"+ this.ins.get(i).name);
			System.out.println("Policy is :"+ this.ins.get(i).policy);
			System.out.println("Cost is :"+ this.ins.get(i).cost);
		}
		
		return "submitpage";
	}
	

}
