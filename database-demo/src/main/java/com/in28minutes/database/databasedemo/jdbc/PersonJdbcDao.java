package com.in28minutes.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDao {

	//It is used to establish database connection
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//BeanPropertyRowMapper is used to map the value recieved by the query to person class through getters
	//having the same name
	public List<Person> findAll(){
		return jdbcTemplate.query("select *from person", new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(int id){
		return jdbcTemplate.queryForObject("select *from person where id = ?", new Object[] {id},new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	//update is used to delete or update the query and there will be no row mapper required because we are not 
	//mapping anything and it will return and int value which tells how many rows are affected
	public int deleteById(int id){
		return jdbcTemplate.update("delete from person where id = ?", new Object[] {id});
	}
	
	public int insert(Person p){
		return jdbcTemplate.update("insert into person(id, name, location) values(?,?,?);", 
				new Object[] {p.getId(), p.getName(), p.getLocation()});
	}
	
	// for temporary understanding new object of Person class is created with particular id and 
	//old one is automatically deleted in update command
	public int update(Person p){
		return jdbcTemplate.update("update person set name = ?, location = ? where id = ?", 
				new Object[] {p.getName(), p.getLocation(), p.getId()});
	}
}
