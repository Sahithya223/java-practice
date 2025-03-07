package com.security.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	
	List<Student> students= new ArrayList<>(List.of(
			new Student(1, "shanvi"),
			new Student(2,"Vishruth")));
    
	@GetMapping("hello")
	public String greet(HttpServletRequest request)
	{
		return "Hello World"+request.getSession().getId();
	}
	
	@GetMapping("students")
	public List<Student> getStudents()
	{
		return students;
	}
	
	@PostMapping("addStudent")
	public void addStudent(@RequestBody Student student)
	{
		students.add(student);
	}
	
	@GetMapping("csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request)
	{
		return (CsrfToken)request.getAttribute("_csrf");
	}
}
