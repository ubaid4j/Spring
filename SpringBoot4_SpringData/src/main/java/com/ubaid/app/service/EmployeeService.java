package com.ubaid.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ubaid.app.entity.Employee;

@Service
public interface EmployeeService
{
	public Employee getEmployee(int id);
	
	public List<Employee> getEmployees();
	
	public Employee updateEmployee(Employee employee);
	
	public int deleteEmployee(int id);
}
