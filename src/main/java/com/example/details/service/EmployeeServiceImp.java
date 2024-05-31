package com.example.details.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.details.entity.Employee;
import com.example.details.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	EmployeeRepository empRepo;

	@Override
	public Employee postEmp(Employee post) {
		return empRepo.save(post);
	}

	@Override
	public List<Employee> postAll(List<Employee> allPost) {
		return empRepo.saveAll(allPost) ;
	}

	@Override
	public Optional<Employee> getEmp(int id) {
		return empRepo.findById(id);
	}

	@Override
	public List<Employee> getAll() {
		return empRepo.findAll();
	}
	
}
