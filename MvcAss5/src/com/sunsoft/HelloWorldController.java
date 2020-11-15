package com.sunsoft;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	static ArrayList<Student> stu = new ArrayList<Student>();
	
	@RequestMapping("/insertstu")
	public String addUser(HttpServletRequest request,HttpServletResponse res,Model m) {
		String name=request.getParameter("name");
		int id=Integer.parseInt(request.getParameter("id"));
		int marks=Integer.parseInt(request.getParameter("marks"));
		Student I = new Student(id,name,marks);
		stu.add(I);
		return "inserted";
	}
	
	@RequestMapping("/insert")
	public String insert() {
		return "insertinto";
	}
	@RequestMapping("/update")
	public String updateStu() {
		return "updatestu";
	}
	
	@RequestMapping("/delete")
	public String deleteStu() {
		return "deletestu";
	}
	
	@RequestMapping("/display")
	public String showUser() {
		for(int i=0;i<this.stu.size();i++) {
			System.out.println("Name is :"+ stu.get(i).getName());
			System.out.println("ID is :"+ this.stu.get(i).getId());
			System.out.println("Marks are :"+ this.stu.get(i).getMarks());
	}
		return "studentdetails";
}
	
	@RequestMapping("/updateinto")
	public String update(HttpServletRequest request,HttpServletResponse res,Model m) {
		int id=Integer.parseInt(request.getParameter("id"));
		int marks=Integer.parseInt(request.getParameter("marks"));
		for(int i=0;i<this.stu.size();i++) {
			if(id==stu.get(i).getId()) {
				stu.get(i).setMarks(marks);
			}
		}
		return "updated";
	}
	
	@RequestMapping("/deletefrom")
	public String delete(HttpServletRequest request,HttpServletResponse res,Model m) {
		int id=Integer.parseInt(request.getParameter("id"));
		for(int i=0;i<this.stu.size();i++) {
			if(id==stu.get(i).getId()) {
				stu.remove(i);
				break;
			}
		}
		return "deleted";
	}
	
	
	
}
