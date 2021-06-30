package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int id;
	private String name;
	private String courseName;
	@Autowired
	private Technologies techDetail;
	
	public Technologies getTechDetail() {
		return techDetail;
	}
	public void setTechDetail(Technologies techDetail) {
		this.techDetail = techDetail;
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
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void display() {
		System.out.println("Customers Object Returned Correctly");
		techDetail.tech();
	}
}
