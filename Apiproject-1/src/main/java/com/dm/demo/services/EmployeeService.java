package com.dm.demo.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dm.demo.entities.Employee;

public class EmployeeService implements EmployeeServices {
	SessionFactory factory= new Configuration()
			.configure()
			.addAnnotatedClass(Employee.class)
			.buildSessionFactory();

	public Employee addEmployee(Employee employee) {
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		session.persist(employee);
		return employee;
		
	}

	public List<Employee> getAllEmployees() {
		Session session =factory.getCurrentSession();
	session.beginTransaction();
	List<Employee> list=session.createQuery("from Employee").getResultList();
return list;
	}

	public void deleteEmployeeById(String id) {
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		Employee employee=session.get(Employee.class, id);
		session.remove(employee);
		session.getTransaction().commit();
	}

	public void updateEmployee(String id, Employee employee) {
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		String id1 =employee.getId();
		Employee employee1= session.get(Employee.class, id1);
		employee=employee1;
		session.getTransaction().commit();
	}

	
}
