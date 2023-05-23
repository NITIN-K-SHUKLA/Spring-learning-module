package com.in28minutes.database.databasewithentitydemo.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

	//It is used to establish database connection
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	@PersistenceContext
	EntityManager entityManager;
	
	//BeanPropertyRowMapper is used to map the value recieved by the query to person class through getters
	//having the same name
	public Person findById(int id){
		return entityManager.find(Person.class, id);
	}
	
	public Person update(Person person) {
		return entityManager.merge(person);
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	
	public void deleteById(int id)
	{
		Person person = entityManager.find(Person.class, id);
		entityManager.remove(person);
	}
}
