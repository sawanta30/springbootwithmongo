package com.mongodb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.beans.Employee;
import com.mongodb.service.EmployeeRepository;

@Service
public class MongoDao {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
}
