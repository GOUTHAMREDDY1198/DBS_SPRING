import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="STD_one_to_one")

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int id;
	
	private String firstName;
	private String lastName;
	private int marks;
	
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	private Address address;
	
	
	public Student() {}
	
	public Student(int id, String fn, String ln, int m) {
		this.id=id;
		this.firstName=fn;
		this.lastName=ln;
		this.marks=m;
	}
	
	public Student(int id, String fn, String ln, int m,Address add) {
		this.id=id;
		this.firstName=fn;
		this.lastName=ln;
		this.marks=m;
		this.address=add;
	}
	
	public int getId() {
		return this.id;
	}
	public int getMarks() {
		return this.marks;
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
	
	public void setMarks(int m) {
		this.marks=m;
	}
	
	public void setFirstName(String fn) {
		this.firstName=fn;
	}
	
	public void setLastName(String ln) {
		this.lastName=ln;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public void setAddress(Address add) {
		this.address=add;
	}
	
	
	
	
}
