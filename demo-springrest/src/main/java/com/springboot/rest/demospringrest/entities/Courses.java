package com.springboot.rest.demospringrest.entities;

public class Courses {
	
	private int id;
	private String title;
	private String description;
	public Courses(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	 
	 
	public Courses(String message, boolean b) {
		super();
		// TODO Auto-generated constructor stub
		 
	}


 


	 


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", description=" + description + "]";
	}


	public Courses orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}


	 

}
