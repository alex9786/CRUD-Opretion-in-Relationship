package com.example.details.service;

import java.util.List;
import java.util.Optional;

import com.example.details.entity.Employee;

public interface EmployeeService {

	Employee postEmp(Employee post);

	List<Employee> postAll(List<Employee> allPost);

	Optional<Employee> getEmp(int id);

	List<Employee> getAll();

}
