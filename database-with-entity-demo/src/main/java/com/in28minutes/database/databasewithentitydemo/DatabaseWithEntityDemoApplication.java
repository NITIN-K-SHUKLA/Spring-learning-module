package com.in28minutes.database.databasewithentitydemo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasewithentitydemo.entity.Person;
import com.in28minutes.database.databasewithentitydemo.entity.PersonJpaRepository;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class DatabaseWithEntityDemoApplication implements CommandLineRunner{

private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
    @Autowired
    private PersonJpaRepository dao;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseWithEntityDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		logger.info("Values are {}",dao.findAll());
		logger.info("Value by Id {}", dao.findById(1001));
		dao.deleteById(1005);
		logger.info("Insert by Id {}", dao.insert(new Person("Nitin6","delhi")));
		logger.info("Update by Id {}", dao.update(new Person(1001,"NitinReal", "delhi")));

	}

}
