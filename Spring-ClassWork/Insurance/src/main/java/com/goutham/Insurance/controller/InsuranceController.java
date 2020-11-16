package com.goutham.Insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goutham.Insurance.dao.InsuranceDao;
import com.goutham.Insurance.model.InsuranceData;

@RestController
public class InsuranceController {
//	@Autowired
	InsuranceDao dao;
	@RequestMapping("/insert")
	public String insert() {
		InsuranceData i1 = new InsuranceData(3,"Rajini", "11/12/1980","1234567890","Chennai","Male");
		InsuranceData i2 = new InsuranceData(4,"Thaliva", "11/12/1980","166464565","Heaven","Male");
		dao.insertData(i1);
		dao.insertData(i2);
		return "Data Inserted Succesfully";
	}
}
