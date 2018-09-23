package com.gulden.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gulden.Dao.EmployeeDao;
import com.gulden.Entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	@Qualifier("Map")
	private EmployeeDao _employeeDao;
	
	public Collection<Employee> getAllEmployee() {
		return this._employeeDao.getAllEmployee();
	}

	public Employee getEmployeeById(int id) {
		return this._employeeDao.getEmployeeById(id);
	}

	public void deleteEmployeeById(int id) {
		this._employeeDao.deleteEmployeeById(id);
	}

	public void updateEmployee(Employee employee) {
		this._employeeDao.updateEmployee(employee);
	}

	public void insertEmployee(Employee employee) {
		this._employeeDao.insertEmployee(employee);
	}
}
