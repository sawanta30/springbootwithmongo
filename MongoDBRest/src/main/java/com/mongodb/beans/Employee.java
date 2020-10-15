package com.mongodb.beans;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Document(collection = "Employee")
public class Employee {

	@Id
	private String id;
	private String name;
	private String designation;
	private Grades grade;
	
	@JsonFormat(shape=Shape.STRING,pattern="dd/mm/yyyy")
	private Date dateOfBirth;
	@JsonFormat(shape=Shape.STRING,pattern="dd/mm/yyyy")
	private Date dateOfJoin;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Grades getGrade() {
		return grade;
	}
	public void setGrade(Grades grade) {
		this.grade = grade;
	}
	
	
	
	
	
}
