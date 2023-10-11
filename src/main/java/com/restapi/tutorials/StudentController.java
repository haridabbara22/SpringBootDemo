package com.restapi.tutorials;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


	@GetMapping("/student")
	public Student getStudent()
	{
		return new Student("Hari","Dabbara");
		
	}
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList();
		students.add(new Student("Hari","Dabbara"));
		students.add(new Student("Siva","Krishna"));
		students.add(new Student("Kalyan","Krishna"));
		students.add(new Student("KrishnaSai","Pulakanti"));
		return students;
		
	}
	
	
	//@PathVaraiable Annatation
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName)
	{
		return new Student(firstName, lastName);
		
	}
	
	//@RequestParam Annotation
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam(name = "firstName") String firstName,
			 @RequestParam(name = "lastName") String lastName)
	{
		return new Student(firstName, lastName);
		
	}
}
