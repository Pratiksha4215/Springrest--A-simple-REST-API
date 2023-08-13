package com.springrest.springrest.entities;

public class Course {
	
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	private String description;
	private String title;
	public Course(long id, String description, String title) {
		super();
		this.id = id;
		this.description = description;
		this.title = title;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", description=" + description + ", title=" + title + "]";
	}
	
	
	}
	
	

