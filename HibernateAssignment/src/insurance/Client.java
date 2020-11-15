package insurance;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
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
			Insurance ins = new Insurance(2,"Nani",5,6000);
			c1.insert(ins);
			c1.updateRecord(1, 10);
			c1.displayData();
			c1.deleteRecord(2);
			c1.displayData();
			
		}catch(HibernateException ex) {
			System.out.println("Error is : "+ex);
		}
		
		
		
	}
	
	public void insert(Insurance insObj) {
		Session ses = factory.openSession();
		
		Transaction t = ses.beginTransaction();
		
		
		ses.save(insObj);
		t.commit();
		ses.close();
		
	}
	
	
	public void displayData() {
		Session ses = factory.openSession();
		
		List empList = ses.createQuery("From Insurance").list();
		
		for(Iterator iter =  empList.iterator();iter.hasNext(); ) {
			Insurance ins =(Insurance) iter.next();
			
			System.out.println("Name is: "+ins.getName());
			System.out.println("Policy is: "+ins.getPolicyNo());
			System.out.println("Tenure is: "+ins.getTenure());
			System.out.println("Amount is: "+ins.getAmount());
			
			
		}
		ses.close();
		
	}
	
	public void updateRecord(int policyNo,int ten) {
		Session ses = factory.openSession();
		Transaction t = ses.beginTransaction();
		Insurance ins = (Insurance) ses.get(Insurance.class, policyNo);
		ins.setTenure(ten);
		ses.update(ins);
		t.commit();
		ses.close();


	}
	
	public void deleteRecord(int policyNo) {
		Session ses = factory.openSession();
		Transaction t = ses.beginTransaction();
		Insurance ins = (Insurance) ses.get(Insurance.class, policyNo);
		ses.delete(ins);
		t.commit();
		ses.close();


	}
	
	
	
	
	
	

}
