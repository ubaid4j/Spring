package com.ubaid.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubaid.app.entity.Employee;
import com.ubaid.app.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController
{
	@Autowired
	EmployeeService service;
	
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return service.getEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return service.getEmployee(id);
	}
	
	@PostMapping("/employees")
	public Employee save(@RequestBody Employee employee)
	{
		employee.setId(0);
		service.saveEmployee(employee);
		return employee;
	}
	
	@PutMapping("/employees")
	public Employee update(@RequestBody Employee employee)
	{
		service.saveEmployee(employee);
		return employee;
	}
	
	@DeleteMapping("/employees/{id}")
	public String delete(@PathVariable int id)
	{
		Employee employee = service.getEmployee(id);
		String info = "Employee not found";
		if(employee != null)
		{
			service.deleteEmployee(id);
			info = "Employee Deleted: ~id = " + id;
		}
		
		return info;
	}
}
