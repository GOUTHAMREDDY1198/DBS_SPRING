package com.goutham.Insurance.model;

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
	public InsuranceData(int id, String fullname, String dob, String mobile, String address, String sex) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
		this.sex = sex;
	}
	@Column
	String mobile;
	@Column
	String address;
	@Column
	String sex;
	public InsuranceData() {}

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
