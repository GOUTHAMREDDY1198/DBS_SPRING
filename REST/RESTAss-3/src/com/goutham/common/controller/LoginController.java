package com.goutham.common.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/fullname")
public class LoginController {

	@RequestMapping(value="/display",method=RequestMethod.POST)
	public String createEmployee(@RequestBody String name ){
		String firstname=name.split("&")[0].split("=")[1];
		String lastname=name.split("&")[1].split("=")[1];
		
		return firstname+" " +lastname;
		
		
		
	}
}