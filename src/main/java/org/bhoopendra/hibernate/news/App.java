package org.bhoopendra.hibernate.news;

import java.util.ArrayList;
import java.util.List;

import org.bhoopendra.hibernate.beans.Address;
import org.bhoopendra.hibernate.beans.Employee;
import org.bhoopendra.hibernate.beans.Laptop;
import org.bhoopendra.hibernate.beans.Message;
import org.bhoopendra.hibernate.conf.SessionFactoryCreator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Laptop> laptops = new ArrayList<Laptop>();
    	laptops.add(new Laptop(101, "HP", "Windows", new Employee("bhoopendra", 5001, new Address("street", "Budaun", "UP", 243601), null)));
    	Employee employee = new Employee("mohan", 12457, new Address("street number -5", "delhi", "Uttar Pradesh", 201301),laptops);
    	SessionFactory sessionFactory = SessionFactoryCreator.getSessionFactoryInstance();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.save(employee);
    	transaction.commit();
    	Employee employee2 =session.get(Employee.class, 12457);
    	System.out.println(employee2);
    	session.close();
    	Session session2 = sessionFactory.openSession();
    	Transaction tx = session2.beginTransaction();
    	
    }
}
