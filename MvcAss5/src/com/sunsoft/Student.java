
package com.sunsoft;

public class Student {

	private int id;
	private String name;
	private int marks;
	
	
	
	public Student() {}
	
	public Student(int id, String n, int m) {
		this.id=id;
		this.name=n;
		this.marks=m;
	}
	

	
	public int getId() {
		return this.id;
	}
	public int getMarks() {
		return this.marks;
	}
	
	public String getName() {
		return this.name;
	}
	

	public void setId(int id) {
		this.id=id;
	}
	
	public void setMarks(int m) {
		this.marks=m;
	}
	
	
	public void setName(String ln) {
		this.name=ln;
	}
	
	
	
	
	
}
