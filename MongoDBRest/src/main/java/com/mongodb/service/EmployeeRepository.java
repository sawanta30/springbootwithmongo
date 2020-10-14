package com.mongodb.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.beans.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

	
	
}
