package com.goutham.withdatabase.Model;

import javax.persistence.*;

@Entity
@Table(name="insurancedata")
public class InsuranceData {
	@Id
	@Column
	int id;
	
	@Column
	String fullname;
	@Column
	String dob;
	@Column
	int tenure;
	@Column
	int cost;
	
	public InsuranceData(int id, String fullname, String dob, String mobile, String address, String sex,int tenure,int cost) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
		this.sex = sex;
		this.tenure=tenure;
		this.cost=cost;
	}
	@Column
	String mobile;
	@Column
	String address;
	@Column
	String sex;
	public InsuranceData() {}
	
	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
