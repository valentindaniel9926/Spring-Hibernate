package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	//define @PostConstruct to load the student data,only i=once!
	
	@PostConstruct
	public void loadData() {
		   theStudents =  new ArrayList<>();
		   theStudents.add(new Student("Valentin", " Daniel"));
		   theStudents.add(new Student("Andrei" , "Anderson"));
		   theStudents.add(new Student("Mary" , "Smith"));
		
	}
	
	//define endpoint for "/student"
	
	@GetMapping("/students")
	public List<Student> getStudents(){
	
	return theStudents;
	
	}
	
	
	//define endpoint for "/students/{studentId}" - return student at index
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
	
		return theStudents.get(studentId);

}
	
}
