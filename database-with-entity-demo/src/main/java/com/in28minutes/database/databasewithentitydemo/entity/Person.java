package com.in28minutes.database.databasewithentitydemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="person") // It is optional basically jpa provides default settings where table name matches with class name
public class Person {

	@Id // used to say that this is primary key
	@GeneratedValue  // will generate id automatically
	private int id;
	@Column(name="name")// similarly this is also an optional work as jpa provides this by default
	String name;
	String location;
	
	public Person(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public Person(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
