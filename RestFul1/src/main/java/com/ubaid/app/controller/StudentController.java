package com.ubaid.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubaid.app.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentController
{
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Ubaid", "ur Rehman"));
		students.add(new Student("Attiq", "Rehman"));
		students.add(new Student("Ahsan", "Farooq"));
		students.add(new Student("Kashif", "Nazir"));
		
		return students;
	}
}
