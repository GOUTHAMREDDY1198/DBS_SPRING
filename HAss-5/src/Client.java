import java.util.*;

import java.util.Iterator;

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
			
			c1.InsertIntoDB(2, "Goutham", "Hyderabad", 23);
			c1.InsertIntoDB(3, "Nani", "Dubai", 26);
			c1.InsertIntoDB(4, "Shiva", "Nagol", 80);
			c1.InsertIntoDB(5, "Latha", "Bhongir",44);
			c1.displayData();
//			c1.displayWithSQL();
//			c1.updateRecord(4, 10000);
//			c1.deleteRecord(1);
			
		}catch(HibernateException ex) {
			System.out.println("Error is : "+ex);
		}

	}
	
	
	public void InsertIntoDB(int id, String name,String des,int age) {
		Session ses = factory.openSession();
		
		Transaction t = ses.beginTransaction();
		
		Reservation res= new Reservation(id,name,des,age);
		
		ses.save(res);
		t.commit();
		ses.close();
		
	}
	
	public void displayData() {
		Session ses = factory.openSession();
		Criteria cr =ses.createCriteria(Reservation.class);
		cr.add(Restrictions.between("age", 25, 45));
		List passList = cr.list();
		
		
		for(Iterator iter =  passList.iterator();iter.hasNext(); ) {
			Reservation res =(Reservation) iter.next();
			
			System.out.println("Name: "+res.getName());
			System.out.println("Destination: "+res.getDestination());
			System.out.println("Age: "+res.getAge());
			
		}
		ses.close();
		
	}
	
	
	
	
	

}
