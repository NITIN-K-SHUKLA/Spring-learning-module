package com.in28minutes.springboot.learnspringboot;

public class Course {
	
	private int id;
	private String name, author;
	
	public Course(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	//getters are must needed to display data at localhost website
	public int getId() {
		return id;
	}
	public String getAuthor() {
		return author;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
