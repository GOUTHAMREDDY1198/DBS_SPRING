package com.goutham.common.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.goutham.common.model.Electricity;


@RestController
@RequestMapping("/Electricity")
public class ElectricityController {
	
	static ArrayList <Electricity> users = new ArrayList<Electricity>();
	static HashMap<Integer,Electricity> hm1 = new HashMap<Integer,Electricity>();

	public static void createUsers() {
		Electricity e1= new Electricity (1,189,"11/11/2020");
		Electricity e2 =new Electricity (2,254,"20/11/2020");
		Electricity e3= new Electricity (3,354,"30/11/2020");
		Collections.addAll(users,e1,e2,e3);
		
		for(int i=0;i<users.size();i++) {
			hm1.put(users.get(i).getId(),users.get(i));
		}
	}
	
		@RequestMapping(value="/display",method=RequestMethod.POST)
//		@ResponseBody
		public String getMovie(@RequestBody String value) {
			createUsers();
			Electricity user= null;
			int id = Integer.parseInt(value.split("=")[1]);
			if(hm1.containsKey(id)) {
				user = hm1.get(id);
			}
			
			user.setTotal_cost(user.getUnits_consumed());
			
			String message= "Hello user "+user.getId()+" Your bill for this month is RS: "+user.getTotal_cost()+", which must be paid before "+user.getDeadline() ;
			
			return message;
		
		}
	
}