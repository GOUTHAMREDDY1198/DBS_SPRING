package com.sunsoft;

public class Insurance {
	String name;
	String policy;
	int cost;
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Insurance(String name, String policy,int cost) {
		super();
		this.name = name;
		this.policy = policy;
		this.cost=cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
}
