package com.ubaid.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ubaid.app.entity.Employee;

@Repository("jpa")
public class EmployeeDAO_JPA implements EmployeeDAO
{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Employee getEmployee(int id)
	{
		return entityManager.find(Employee.class, id);
	}

	@Override
	public List<Employee> getEmployees()
	{
		TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
		
		List<Employee> employees = query.getResultList();
		
		return employees;
	}

	@Override
	public void saveEmployee(Employee employee)
	{
		Employee employee2 = entityManager.merge(employee);
		employee.setId(employee2.getId());
	}

	@Override
	public void deleteEmployee(int id)
	{
		Query query = entityManager.createQuery("delete from Employee where id = :id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

}
