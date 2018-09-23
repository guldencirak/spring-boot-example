package com.gulden.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.gulden.Entity.Employee;

@Repository
@Qualifier("Map")
public class EmployeeDaoImpl implements EmployeeDao {

	private static Map<Integer, Employee> employees;
	
	 static {

		 employees = new HashMap<Integer, Employee>(){

	            {
	                put(1, new Employee(1, "Naime Çelik"));
	                put(2, new Employee(2, "Recep Un"));
	                put(3, new Employee(3, "Ayla Necmi"));
	            }
	        };
	    }
	
	public Collection<Employee> getAllEmployee() {
		return this.employees.values();
	}

	public Employee getEmployeeById(int id) {
		return this.employees.get(id);
	}

	public void deleteEmployeeById(int id) {
		this.employees.remove(id);
	}

	public void updateEmployee(Employee employee) {
		Employee emp=employees.get(employee.get_id());
		emp.set_name(employee.get_name());
		employees.put(employee.get_id(), employee);
	}

	public void insertEmployee(Employee employee) {
		this.employees.put(employee.get_id(), employee);
	}
}
