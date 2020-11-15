public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee() {}
	
	public Employee(int id, String fn, String ln, int sal) {
		this.id=id;
		this.firstName=fn;
		this.lastName=ln;
		this.salary=sal;
	}
	
	public int getId() {
		return this.id;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setSalary(int sal) {
		this.salary=sal;
	}
	
	public void setFirstName(String fn) {
		this.firstName=fn;
	}
	
	public void setLastName(String ln) {
		this.lastName=ln;
	}
	
	
	
	
	
	
	
}
