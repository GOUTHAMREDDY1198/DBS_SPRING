import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="reservation")

public class Reservation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int id;
	
	private String name;
	private String destination;
	private int age;
	
	
	public Reservation() {}
	
	public Reservation( int id, String name, String des,int age) {
		this.id=
		this.age=age;
		this.name=name;
		this.destination=des;
	}
	
	public int getId() {
		return this.id;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	
	public String getDestination() {
		return this.destination;
	}
	

	public void setId(int id) {
		this.id=id;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	

	public void setName(String fn) {
		this.name=fn;
	}
	
	public void setDestination(String destination) {
		this.destination=destination;
	}
	
	
	
	
	
	
	
}
