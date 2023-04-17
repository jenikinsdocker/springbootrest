package com.boot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.rest.entity.Employee;
import com.boot.rest.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
	Employee emp=employeeService.saveEmployeeDetails(employee);
	return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
	Employee emp=employeeService.updateEmployeeDetails(employee);
	return new ResponseEntity<Employee>(emp,HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Employee> deleteEmployee(@RequestBody Employee employee){
	employeeService.deleteEmployeeDetails(employee);
	return new ResponseEntity("Sucessfully Deleted from DB..",HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/byId/{id}")
	public ResponseEntity<Employee> findById(@PathVariable("id") int id){
		Employee employee=employeeService.findByIdDeatils(id);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@GetMapping("/byName")
	public ResponseEntity<Employee> findByName(@RequestParam(name ="name") String name){
		Employee employee=employeeService.findByNameDetails(name);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}

	@GetMapping("/findAll")
	public ResponseEntity<Employee> findAllEmployees(){
		List<Employee> employee=employeeService.findAllDetails();;
		return new ResponseEntity(employee,HttpStatus.OK);
	}
}
