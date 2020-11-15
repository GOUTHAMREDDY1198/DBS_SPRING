package com.goutham.common.model;


public class Library {
	private int id;
	private String name;
	private String author;
	private int cost;
	public Library(int id, String name, String author, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "ID: "+id+" Name: "+name+" Author: "+author+" Cost: "+cost+" ";
	}
	
}
