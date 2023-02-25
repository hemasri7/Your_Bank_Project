package com.axis.service;

import java.util.List;

import com.axis.model.EmployeeSalary;

public interface EmployeeSalaryService {
	public EmployeeSalary addSalary(EmployeeSalary sal);
	public List<EmployeeSalary> getAll(); 
	public EmployeeSalary update(String employeeId,EmployeeSalary sal);
	public String delete(String employeeId);
	public EmployeeSalary search(String employeeId);

}
