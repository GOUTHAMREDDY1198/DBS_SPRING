package com.goutham.withdatabase.dao;

import java.util.List;

import com.goutham.withdatabase.Model.InsuranceData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goutham.withdatabase.repository.InsuranceRepository;

@Service
public class InsuranceDAO {
	@Autowired
	InsuranceRepository sr;
	
	public void insertData(InsuranceData obj) {
		sr.save(obj);
	}
	public void deleteData(int id) {
		sr.deleteById(id);
	}
	public List<InsuranceData> displayAll(){
		List<InsuranceData> list =(List<InsuranceData>) sr.findAll();
		return list;
	}
	public void updateData(int id, String Mobile) {
		
		 System.out.println( sr.findById(id));
	}
	
}
