package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="currency-service")
@Component
public class CurrencyConfig {

	private String url;
	private String username; // the name should be exactly similar to name given at application.properties file
	private String key;
	private String fire;
	
	//setters to read data from files and getters to display data at localhost
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getFire() {
		return fire;
	}
	public void setFire(String fire) {
		this.fire = fire;
	}
}
