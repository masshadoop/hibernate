package info.sscomputers.client;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import info.sscomputers.model.Employee;

public class InsertEmployee {

	public static void main(String[] args) {
        Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx;
		String choice="no";
		Scanner scan=new Scanner(System.in);
				
		do{
			tx = session.beginTransaction();
			Employee employee = new Employee();
			System.out.println("Enter Employee Number:");
			employee.setEmpno(scan.nextInt());
			System.out.println("Enter Emplyee Name:");
			employee.setEname(scan.next());
			System.out.println("Enter Employee Anuual Salary:");
			employee.setSalary(scan.nextInt());
			session.save(employee);
			session.flush();
			tx.commit();
			System.out.println("one record inserted successfully");
			System.out.println("Do you want insert new employee record y/n");
			choice=scan.next();
		}while(choice.equalsIgnoreCase("y")|choice.equalsIgnoreCase("yes"));
				
		session.close();
		sessionFactory.close();

	}

}

