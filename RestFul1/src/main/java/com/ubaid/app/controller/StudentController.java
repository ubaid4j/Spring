package com.ubaid.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubaid.app.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentController
{
	
	private List<Student> students;
	
	@PostConstruct
	public void load()
	{
		students = new ArrayList<Student>();
		students.add(new Student("Ubaid", "ur Rehman"));
		students.add(new Student("Attiq", "Rehman"));
		students.add(new Student("Ahsan", "Farooq"));
		students.add(new Student("Kashif", "Nazir"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return students;
	}
	
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id)
	{
		return students.get(id);
	}
}
