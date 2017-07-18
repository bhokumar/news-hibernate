package org.bhoopendra.hibernate.news;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bhoopendra.hibernate.beans.Address;
import org.bhoopendra.hibernate.beans.Employee;
import org.bhoopendra.hibernate.beans.Laptop;
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
    	Logger logger = Logger.getLogger(App.class.getName());
    	logger.log(Level.INFO, "Application getting started!");
    	List<Laptop> laptops = new ArrayList<Laptop>();
    	logger.log(Level.INFO, "List of laptops is created");
    	laptops.add(new Laptop(101, "HP", "Windows", new Employee("bhoopendra", 5001, new Address("street", "Budaun", "UP", 243601), null)));
    	logger.log(Level.INFO, "Creating laptop object");
    	Employee employee = new Employee("mohan", 12457, new Address("street number -5", "delhi", "Uttar Pradesh", 201301),laptops);
    	logger.log(Level.INFO, "Getting Session Factory object");
    	SessionFactory sessionFactory = SessionFactoryCreator.getSessionFactoryInstance();
    	logger.log(Level.INFO, "Got session factory object !");
    	logger.log(Level.INFO, "Creating Session object!");
    	Session session = sessionFactory.openSession();
    	logger.log(Level.INFO, "Session object created!");
    	Transaction transaction = session.beginTransaction();
    	logger.log(Level.INFO, "Transaction created");
    	session.save(employee);
    	logger.log(Level.INFO, "Object saved");
    	transaction.commit();
    	Employee employee2 =session.get(Employee.class, 12457);
    	System.out.println(employee2);
    	session.close();
		sessionFactory.close();
    }
}
