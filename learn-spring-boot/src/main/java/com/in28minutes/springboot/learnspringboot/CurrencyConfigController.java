package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {

	// url = http://localhost:8080/courses
	@Autowired
	private CurrencyConfig currencyConfig;
	@RequestMapping("/currency-controller")
	public CurrencyConfig retrieveAllData(){
		
		// to get all data you have to write all the getters of variables.
		return currencyConfig;
	}
}
