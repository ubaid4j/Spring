package com.ubaid.app.controller;

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
public class RestAPIController
{
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return service.getEmployee(id);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return service.getEmployees();
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return service.updateEmployee(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		if(service.deleteEmployee(id) > -1)
			return "Employee deleted of id " + id;
		throw new RuntimeException("not deleted due to unknown exception");
	}
}
