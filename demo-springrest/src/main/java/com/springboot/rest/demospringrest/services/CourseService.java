package com.springboot.rest.demospringrest.services;
import java.util.List;
import com.springboot.rest.demospringrest.entities.Courses;
import com.springboot.rest.demospringrest.entities.*;

public interface CourseService  {
  public List<Courses> getCourses();
  
  public Courses getCourse(int courseId);

public Courses addCourse(Courses course);

public  void deleteCourse(int  courseId);

 

 
}
