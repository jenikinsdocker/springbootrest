package com.boot.rest.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.boot.rest.entity.Employee;

@Service
public interface EmployeeService {
	
	public Employee saveEmployeeDetails(Employee employee);
	
	public Employee updateEmployeeDetails(Employee employee);
	
	public void deleteEmployeeDetails(Employee employee);
	
	public Employee findByIdDeatils(int id);
	
	public Employee findByNameDetails(String name);
	
	public List<Employee> findAllDetails();
	

}
