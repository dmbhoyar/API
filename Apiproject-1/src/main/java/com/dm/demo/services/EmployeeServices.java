package com.dm.demo.services;

import java.util.List;

import com.dm.demo.entities.Employee;

public interface EmployeeServices {
	
	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployeeById(String id);
	public void updateEmployee(String id, Employee employee);

}
