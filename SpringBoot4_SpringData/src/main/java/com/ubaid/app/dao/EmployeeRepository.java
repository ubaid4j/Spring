package com.ubaid.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubaid.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
