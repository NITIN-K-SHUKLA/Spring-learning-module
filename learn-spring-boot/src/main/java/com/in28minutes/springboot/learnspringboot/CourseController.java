package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	// url = http://localhost:8080/courses
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllData(){
		
		// to get all data you have to write all the getters of variables.
		return Arrays.asList(new Course(1,"C++","Bjarne Stroustrup"),
				new Course(2,"Java","JavaAuthor"),
				new Course(3,"Python","PythonAuthor")
				);
	}
}
