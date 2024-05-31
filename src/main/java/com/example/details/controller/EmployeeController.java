package com.example.details.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.details.entity.Employee;
import com.example.details.service.EmployeeService;

@RestController

@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@PostMapping("/post")
	public Employee postEmp(@RequestBody Employee post) {
		return empService.postEmp(post);
	}
	
	@PostMapping("/postAll")
	public List<Employee> postAll(@RequestBody List<Employee> allPost){
		return empService.postAll(allPost);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Employee> getEmp(@PathVariable ("id")int id){
		return empService.getEmp(id);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		return empService.getAll();
	}
	
	
	
	
	
	
	
	
	
	
	
}
