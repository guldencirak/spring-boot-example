package com.gulden.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gulden.Entity.Employee;
import com.gulden.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService _employeeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Employee> getAllEmployees(){
		return _employeeService.getAllEmployee();
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") int id) {
    		return _employeeService.getEmployeeById(id);
    }
	
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
    public void insertEmployee(@RequestBody Employee employee) {
    		 _employeeService.insertEmployee(employee);
    }
	
}
