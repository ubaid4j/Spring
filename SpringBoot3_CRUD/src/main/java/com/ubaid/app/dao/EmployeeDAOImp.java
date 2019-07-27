package com.ubaid.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ubaid.app.entity.Employee;

@Repository
public class EmployeeDAOImp implements EmployeeDAO
{
	
	/**
	 * 
	 * Remember: Spring Boot automatically create DataSource and EntityManager Bean
	 */
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Employee getEmployee(int id)
	{
		Session session = getCurrentSession();
		Employee employee = session.get(Employee.class, id);
		return employee;
	}

	@Override
	public List<Employee> getEmployees()
	{
		Session session = getCurrentSession();
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

	@Override
	public void saveEmployee(Employee employee)
	{
		Session session = getCurrentSession();
		session.saveOrUpdate(employee);
	}

	@Override
	public void deleteEmployee(int id)
	{
		Session session = getCurrentSession();
		Query<?> del = session.createQuery("delete from Employee where id=:id");
		del.setParameter("id", id);
		del.executeUpdate();
	}
	
	private Session getCurrentSession()
	{
		return entityManager.unwrap(Session.class);
	}

}
