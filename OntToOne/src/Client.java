import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class Client {
	public static SessionFactory factory;
	
	public static void getSessionFactory() {
		try {
			Configuration conf = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
			factory = conf.buildSessionFactory(builder.build());
		}catch(Throwable ex) {
			System.err.println("Failed to create session object: "+ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			getSessionFactory();
			Client c1= new Client();
			
			Address add1 = new Address("Ramnagar","Bhongir","Telangana","508116");
			Employee emp1 = new Employee(10,"Arun","Jitta",10000);
			emp1.setAddress(add1);
//			c1.InsertIntoDB(emp1, add1);
			
			Address add2 = new Address("Annapurna","Uppal","Telangana","500098");
			Employee emp2 = new Employee(11,"Sandhya","bee",900000);
			emp2.setAddress(add2);
//			c1.InsertIntoDB(emp2, add2);
			
			c1.displayData();
			
		}catch(HibernateException ex) {
			System.out.println("Error is : "+ex);
		}

	}
	
	
	public void InsertIntoDB(Employee empObj,Address addObj) {
		Session ses = factory.openSession();
		
		Transaction t = ses.beginTransaction();
		
		
		ses.save(empObj);
		ses.save(addObj);
		t.commit();
		ses.close();
		
	}
	
	public void displayData() {
		Session ses = factory.openSession();
		
		List empList = ses.createQuery("From Employee").list();
		
		for(Iterator iter =  empList.iterator();iter.hasNext(); ) {
			Employee emp =(Employee) iter.next();
			
			System.out.println("First name: "+emp.getFirstName());
			System.out.println("Last name: "+emp.getLastName());
			System.out.println("Salary: "+emp.getSalary());
			Address add = emp.getAddress();
			System.out.println("Addresses.....");
			System.out.println("Street name: "+add.getStreet());
			System.out.println("City name: "+add.getCity());
			System.out.println("State name: "+add.getState());
			System.out.println("Zip code: "+add.getZip());

		}
		ses.close();
		
	}
	

	

	

	
	
	

}
