package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private int id;
	private String name;
	
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
	
	public void tech() {
		System.out.println("Completed - Technologies");
	}
}
