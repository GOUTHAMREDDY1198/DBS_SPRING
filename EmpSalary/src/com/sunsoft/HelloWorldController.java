package com.sunsoft;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@RequestMapping("/welcome/{id1}")
	public String helloWorld(@RequestParam("id") int id,
							 @RequestParam("name") String name,
							 @RequestParam("basic") int basic,
							 @RequestParam("hra") int hra,
							 @RequestParam("da") int da,
							 @RequestParam("it") int it,
							 @RequestParam("deduction") int deduction,
							 @PathVariable("id1") int id1,
							 Model m) {
		if(id==1111) {
		
		String message="Given data ID: "+id+"Name: "+name;
		int net_pay = basic + hra + da + it - deduction ;
		int gross_pay = basic + hra + da + it;
		m.addAttribute("message",message);
		m.addAttribute("net",net_pay);
		m.addAttribute("gross",gross_pay);
		return "welcomepage";
		}
		else {
			return "errorpage";
		}
				
	}
	

}
