package com.boot.rest.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.rest.entity.Employee;
import com.boot.rest.repository.EmployeeRepository;
import com.boot.rest.service.EmployeeService;

@Component
public class EmployeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.delete(employee);
		
	}

	@Override
	public Employee findByIdDeatils(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee findByNameDetails(String name) {
		// TODO Auto-generated method stub
		Employee emp= employeeRepository.findByName(name);
		return emp;
	}

	@Override
	public List<Employee> findAllDetails() {
		// TODO Auto-generated method stub
		List<Employee> list=employeeRepository.findAll();
		return list;
	}

}
