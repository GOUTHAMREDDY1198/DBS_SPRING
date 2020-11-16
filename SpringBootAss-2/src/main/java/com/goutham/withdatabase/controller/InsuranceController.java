package com.goutham.withdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goutham.withdatabase.Model.InsuranceData;
import com.goutham.withdatabase.dao.InsuranceDAO;

@RestController
public class InsuranceController {
	@Autowired
	InsuranceDAO dao;
	@RequestMapping("/insert")
	public String insert() {
		InsuranceData s1 = new InsuranceData(30,"Rajini", "11/12/1980","1234567890","Chennai","Male",10,5000);
		InsuranceData s2 = new InsuranceData(40,"Thaliva", "11/12/1980","166464565","Heaven","Male",5,2500);
		dao.insertData(s1);
		dao.insertData(s2);
		return "Data Inserted Succesfully";
	}
	
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable ("id") int id) {
		dao.deleteData(id);
		return "Data deleted";
	}
	
	
	@RequestMapping("/displayall")
	public List<InsuranceData> display(){
		List<InsuranceData> il = dao.displayAll();
		return il;
	}
	
	@RequestMapping("/update/{id}/{mobile}")
	public String update(@PathVariable ("id") int id, @PathVariable ("mobile") String mobile) {
		InsuranceData d=null;
		dao.updateData(id, mobile);
		return "Mobile number updated";
	}
	
	
}
