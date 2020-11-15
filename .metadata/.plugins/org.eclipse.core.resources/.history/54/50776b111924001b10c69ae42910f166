import java.util.*;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


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
			
//			c1.InsertIntoDB(2, "Goutham", "Kallem", 800000);
//			c1.InsertIntoDB(3, "Nani", "Kallem", 100000);
//			c1.InsertIntoDB(4, "Shiva", "Kallem", 80);
//			c1.InsertIntoDB(5, "Latha", "Kallem", 8000);
//			c1.displayData();
//			c1.displayWithSQL();
//			c1.updateRecord(4, 10000);
			c1.deleteRecord(1);
			
		}catch(HibernateException ex) {
			System.out.println("Error is : "+ex);
		}

	}
	
	
	public void InsertIntoDB(int id, String fname,String lname,int sal) {
		Session ses = factory.openSession();
		
		Transaction t = ses.beginTransaction();
		
		Employee e1= new Employee(id,fname,lname,sal);
		
		ses.save(e1);
		t.commit();
		ses.close();
		
	}
	
	public void displayData() {
		Session ses = factory.openSession();
		
		List empList = ses.createQuery("From Employee").list();
		
		for(Iterator iter =  empList.iterator();iter.hasNext(); ) {
			Employee emp =(Employee) iter.next();
			
			System.out.println("First name: "+emp.getFirstName());
			System.out.println("First name: "+emp.getLastName());
			System.out.println("First name: "+emp.getSalary());
			
		}
		ses.close();
		
	}
	
	public void displayWithSQL() {
		Session ses = factory.openSession();
		
		String sql = "SELECT * FROM employee where salary < 800000 ";
		SQLQuery q = ses.createSQLQuery(sql);
		
		q.addEntity(Employee.class);
		List res = q.list();
		
		for(Iterator iter =  res.iterator();iter.hasNext(); ) {
			Employee emp =(Employee) iter.next();
			
			System.out.println("First name: "+emp.getFirstName());
			System.out.println("First name: "+emp.getLastName());
			System.out.println("First name: "+emp.getSalary());
			
		}
		ses.close();

	}
	
	public void updateRecord(int id,int sal) {
		Session ses = factory.openSession();
		Transaction t = ses.beginTransaction();
		Employee emp = (Employee) ses.get(Employee.class, id);
		emp.setSalary(sal);
		ses.update(emp);
		t.commit();
		ses.close();


	}
	
	public void deleteRecord(int id) {
		Session ses = factory.openSession();
		Transaction t = ses.beginTransaction();
		Employee emp = (Employee) ses.get(Employee.class, id);
		ses.delete(emp);
		t.commit();
		ses.close();


	}
	
	
	
	

}
