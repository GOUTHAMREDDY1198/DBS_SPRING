package insurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Insurance {
	

	private int policyNo;
	private String name;
	private int tenure;
	private int amount;
	
	public Insurance() {}
	
	public Insurance(int policyNo,String name,int t,int a) {
		this.amount=a;
		this.name=name;
		this.policyNo=policyNo;
		this.tenure=t;
		
	}
	
	
	public void setPolicyNo(int no) {
		this.policyNo=no;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void setTenure(int t ) {
		this.tenure=t;
	}
	public void setAmount(int a ) {
		this.amount=a;
	}
	
	public int getPolicyNo() {
		return this.policyNo;
	}
	
	public int getTenure() {
		return this.tenure;
	}
	
	public int getAmount() {
		return this.amount;
	}
	public String getName() {
		return this.name;
	}
	
	
}
