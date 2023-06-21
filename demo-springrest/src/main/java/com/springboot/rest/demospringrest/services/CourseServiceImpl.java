package com.springboot.rest.demospringrest.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import com.springboot.rest.demospringrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	List<Courses> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Courses(1,"java core", "Basics Understanding of core java"));
		list.add(new Courses(2,"SpringBoot Course","Creating Rest Api using Spring boot"));
		list.add(new Courses(3,"java Advanced", "let's learn Advanced Java"));
		list.add(new Courses(4,"HTML", "let's learn HTML"));
		list.add(new Courses(5,"CSS", "let's learn CSS"));
		list.add(new Courses(6,"JavaScript", "let's learn Javascript"));
	}
      
  @Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

@Override
public Courses getCourse(int courseId) {
	// TODO Auto-generated method stub
	 Courses c=null;
	 for(Courses coursess:list) {
		 if(coursess.getId()==courseId) {
			 c=coursess;
			 break;
		 }
	 }
	 return c;
}

@Override
public Courses addCourse(Courses course) {
	// TODO Auto-generated method stub
	list.add(course);
	return course;
}

@Override
public    void deleteCourse(int courseId) {
	// TODO Auto-generated method stub
	 list=list.stream().filter(Courses->Courses.getId()!=courseId).collect(Collectors.toList());
	 
}

 

 



}