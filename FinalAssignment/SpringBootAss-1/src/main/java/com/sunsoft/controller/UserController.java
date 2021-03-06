package com.sunsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.model.UserData;
import com.sunsoft.dao.UserDao;




@RestController
public class UserController {
	@Autowired
	UserDao userDao;
	@RequestMapping("/insert")
	public String insertData()
	{
		UserData u1=new UserData(1,"Goutham","9876");
		UserData u2=new UserData(2,"Nani","1234");
		userDao.insertData(u1);
		userDao.insertData(u2);
		return "Data inserted succesfully";
				
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteData(@PathVariable("id") int id)
	{
		userDao.deleteRecord(id);
		return "Record deleted successfully";
	}
	
	@RequestMapping(value = "validate", method = RequestMethod.POST)
	public String searchData(@RequestBody String body)
	{
		String name = body.split("&")[0].split("=")[1]; 
		name=name.replace('+', ' '); 
		String password = body.split("&")[1].split("=")[1];
		password=password.replace('+', ' ');
		if(userDao.SearchRecord(name, password)==true)
		{
		return "Valid User";
		}
		else
		{
			return "Invalid User";
		}
//		String name=body.split(" ")[0];
//		String password=body.split("+")[1].re;
//
//		System.out.println(password);
//		return "Valid";
		
	}
	
	
	@RequestMapping("/displayAll")
	public List<UserData> displayData()
	{
		List<UserData> userList=userDao.displayAll();
		return userList;
	}
	
}
