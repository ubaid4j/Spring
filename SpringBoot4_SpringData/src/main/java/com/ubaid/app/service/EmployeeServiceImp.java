package com.ubaid.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubaid.app.dao.EmployeeRepository;
import com.ubaid.app.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService
{

	@Autowired
	EmployeeRepository emp;
	
	@Override
	public Employee getEmployee(int id)
	{
		return emp.findById(id).get();
	}

	@Override
	public List<Employee> getEmployees()
	{
		return emp.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee)
	{
		return emp.save(employee);
	}

	@Override
	public int deleteEmployee(int id)
	{
		try
		{
			emp.deleteById(id);
			return 1;
		}
		catch (Exception e)
		{
			throw new RuntimeException();
		}
		
	}

}
