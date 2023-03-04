package com.hibernate.Employee.OneToMany;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      //  System.out.println( "Hello World!" );
    	Configuration cfg=new Configuration();		//create object of configuration
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();	//sessionFactory
    	
    	//create object of department
    	Department dept=new Department();
    	dept.setDeptid(101);
    	dept.setDeptname("IT");
    	
    	Employee emp=new Employee(); 
    	emp.setEmpid(11);
    	emp.setEmpname("pranali");
    	emp.setEmpposition("HR");
    	emp.setDepartment(dept);
    	
    	
    	Employee emp1=new Employee();
    	emp1.setEmpid(12);
    	emp1.setEmpname("puja");
    	emp1.setEmpposition("java developer");
    	emp1.setDepartment(dept);
    	
    	Employee emp2=new Employee();
    	emp2.setEmpid(13);
    	emp2.setEmpname("riya");
    	emp2.setEmpposition("manager");
    	emp2.setDepartment(dept);
    	
    	Employee emp3=new Employee();
    	emp3.setEmpid(14);
    	emp3.setEmpname("sham");
    	emp3.setEmpposition("python developer");
    	emp3.setDepartment(dept);
    	
    	List<Employee> l1=new ArrayList<Employee>(); //create list of employee
    	l1.add(emp);
    	l1.add(emp1);
    	l1.add(emp2);
    	l1.add(emp3);
    	dept.setEmployee(l1);
    	
    	
    	Session session=factory.openSession(); 
    	//begin the transaction
    	Transaction tx=session.beginTransaction();
    	session.save(emp);
    	session.save(emp1);
    	session.save(emp2);
    	session.save(emp3);
    	session.save(dept);
    	
    	
    	tx.commit();
    	session.close();
    	factory.close();
    }
}
