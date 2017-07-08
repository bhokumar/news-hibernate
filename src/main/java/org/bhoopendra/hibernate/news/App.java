package org.bhoopendra.hibernate.news;

import org.bhoopendra.hibernate.beans.Address;
import org.bhoopendra.hibernate.beans.Employee;
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
    	Employee employee = new Employee("mohan", 12457, new Address("street number -5", "delhi", "Uttar Pradesh", 201301));
    	SessionFactory sessionFactory = SessionFactoryCreator.getSessionFactoryInstance();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.save(employee);
    	transaction.commit();
    	Employee employee2 =session.get(Employee.class, 12457);
    	System.out.println(employee2);
    	session.close();
    }
}
