package com.ubaid.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ubaid.app.dao.EmployeeDAO;
import com.ubaid.app.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService
{
	@Autowired
	@Qualifier("jpa")
	EmployeeDAO dao;
	
	@Override
	@Transactional
	public Employee getEmployee(int id)
	{
		return dao.getEmployee(id);
	}

	@Override
	@Transactional
	public List<Employee> getEmployees()
	{
		return dao.getEmployees();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee employee)
	{
		dao.saveEmployee(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id)
	{
		dao.deleteEmployee(id);
	}

}
