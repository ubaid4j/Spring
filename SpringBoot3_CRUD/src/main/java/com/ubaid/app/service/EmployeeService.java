package com.ubaid.app.service;

import java.util.List;

import com.ubaid.app.entity.Employee;

public interface EmployeeService
{
	public Employee getEmployee(int id);
	public List<Employee> getEmployees();
	public void saveEmployee(Employee employee);
	public void deleteEmployee(int id);

}
