package com.gulden.Dao;

import java.util.Collection;

import com.gulden.Entity.Employee;;

public interface EmployeeDao {
	
	Collection<Employee> getAllEmployee();

	Employee getEmployeeById(int id);
	
	void deleteEmployeeById(int id);
	
	void updateEmployee(Employee employee);
	
	void insertEmployee(Employee employee);
}
