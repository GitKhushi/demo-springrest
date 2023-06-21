package com.springboot.rest.demospringrest.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.demospringrest.entities.Courses;
import com.springboot.rest.demospringrest.services.CourseService;
import com.springboot.rest.demospringrest.services.*;
import com.springboot.rest.demospringrest.exception.*;

@RestController
public class MyController {
	
	 @Autowired
	 private CourseService courseServicee;
	 
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	
	//get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return  this.courseServicee.getCourses();
}
	 
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		
		return    this.courseServicee.getCourse(Integer.parseInt(courseId));
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		 return this.courseServicee.addCourse(course);
		
		
	}
	
	@DeleteMapping("/courses/{courseId}")
	public  void deleteCourse(@PathVariable("courseId") int courseId) {
		  this.courseServicee.deleteCourse(courseId);
		
	}
	
	  
}
