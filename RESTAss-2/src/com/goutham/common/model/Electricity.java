package com.goutham.common.model;


public class Electricity {
	private int id;
	
	private int units_consumed;
	private int cost_per_unit=10;
	private int total_cost;
	private String deadline;
	
	
	public Electricity(int id, int units_consumed, String deadline) {
		super();
		this.id = id;
		this.units_consumed = units_consumed;
		this.deadline = deadline;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUnits_consumed() {
		return units_consumed;
	}


	public void setUnits_consumed(int units_consumed) {
		this.units_consumed = units_consumed;
	}


//	public int getCost_per_unit() {
//		return cost_per_unit;
//	}
//
//
//	public void setCost_per_unit(int cost_per_unit) {
//		this.cost_per_unit = cost_per_unit;
//	}


	public int getTotal_cost() {
		return total_cost;
	}


	public void setTotal_cost(int total_cost) {
		this.total_cost = this.cost_per_unit *this.units_consumed;
	}


	public String getDeadline() {
		return deadline;
	}


	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	
}
