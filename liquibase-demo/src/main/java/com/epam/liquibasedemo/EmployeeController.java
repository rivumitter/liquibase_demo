package com.epam.liquibasedemo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
		employee.setId(UUID.randomUUID());
		repository.save(employee);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	@GetMapping()
	public ResponseEntity<List<Employee>> getEmp(){
		
		List<Employee> emp = repository.findAll();
		
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}

}
