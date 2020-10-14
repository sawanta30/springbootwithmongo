package com.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.beans.Employee;
import com.mongodb.service.EmployeeRepository;

@RestController
@RequestMapping(value="/v1")
public class MongoRestController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping(value="/employee",method=RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public List<Employee> findAllEmployees(){
		return employeeRepository.findAll();
	}
	@RequestMapping(value="/employee/{id}",method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String id) {
		employeeRepository.deleteById(id);
	}
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
	public Optional<Employee> getEmployee(@PathVariable String id) {
		return employeeRepository.findById(id);
	}
}
