package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.model.EmployeeSalary;
import com.axis.service.EmployeeSalaryService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeSalaryController {
	@Autowired
	private EmployeeSalaryService employeesalaryService;
	
	@PostMapping("/add")
	public ResponseEntity<EmployeeSalary> getSal(@RequestBody EmployeeSalary sal){
		return new ResponseEntity<EmployeeSalary>(employeesalaryService.addSalary(sal),HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<List<EmployeeSalary>> all(){
		return new ResponseEntity<List<EmployeeSalary>>(employeesalaryService.getAll(),HttpStatus.OK);
	}
	@PutMapping("/update/{employeeId}")
	public ResponseEntity<EmployeeSalary> update(@PathVariable String employeeId,@RequestBody EmployeeSalary sal){
		return new ResponseEntity<EmployeeSalary>(employeesalaryService.update(employeeId, sal),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{employeeId}")
	public ResponseEntity<String> delte(@PathVariable String employeeId){
		return new ResponseEntity<String>(employeesalaryService.delete(employeeId),HttpStatus.OK);
	}
	
	@GetMapping("/search/{employeeId}")
	public ResponseEntity<EmployeeSalary> search(@PathVariable String employeeId){
		return new ResponseEntity<EmployeeSalary>(employeesalaryService.search(employeeId),HttpStatus.OK);
	}

}
