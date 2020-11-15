package com.goutham.common.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/login")
public class LoginControllerDB {
	public static SessionFactory factory;
	
	public static void getSessionFactory() {
		try {
			Configuration conf = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
			factory = conf.buildSessionFactory(builder.build());
		}catch(Throwable ex) {
			System.err.println("Failed to create session object: "+ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static void createUsers() {
		User u1= new User("Nani1","Nani1");
		User u2= new User("Nani2","Nani2");
		User u3= new User("Nani3","Nani3");
//		Collections.addAll(usersList, u1,u2,u3);
//		for(int i=0;i<usersList.size();i++) {
//			usersMap.put(usersList.get(i).getUserId(), usersList.get(i));
//		}
		
		Session ses = factory.openSession();
		
		Transaction t = ses.beginTransaction();
		
			
		ses.save(u1);
		ses.save(u2);
		ses.save(u3);
		t.commit();
		ses.close();

		
	}
	@RequestMapping(value="/display",method=RequestMethod.POST)
	public String createEmployee(@RequestBody String name ){
//		String username=name.split("&")[0].split("=")[1];
//		String password=name.split("&")[1].split("=")[1];
//		if(username.equals("goutham") && password.equals("1111") ) {
//			return "Successfully Logged in";
//		}
//		else {
//			return "Invalid Credentials";
//		}
		
		createUsers();

//		String username=name.split("&")[0].split("=")[1];
//		String password=name.split("&")[1].split("=")[1].replaceAll("\\s","");
//		
//		if(usersMap.get(username).getPassword().equals(password) ) {
//			return "Successfully Logged in";
//		}
//		else {
//			return "Invalid Credentials";
//		}
//		
		return "Inserted";
		
	}
}