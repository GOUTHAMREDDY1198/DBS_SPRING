import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int id;
	
	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	public Address() {}
	public Address(String city, String state, String street, String zip) {
		// TODO Auto-generated constructor stub
		this.city=city;
		this.state=state;
		this.street=street;
		this.zipcode=zip;
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public void setId(String street) {
		this.street=street;;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city=city;;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state=state;;
	}
	
	public String getZip() {
		return this.zipcode;
	}
	
	public void setZip(String zipcode) {
		this.zipcode=zipcode;;
	}
	
	
	
	
}
