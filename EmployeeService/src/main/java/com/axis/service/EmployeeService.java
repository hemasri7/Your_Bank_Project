package com.axis.service;

import java.util.List;

import com.axis.model.Employee;

public interface EmployeeService {
	public Employee findByEmployeeId(String employeeId);
	public Employee findByEmployeeIdAndPassword(String employeeId,String password);
	public Employee addEmployee(Employee employee);
	public String updateProfile(Employee employee,String employeeId);
	public String deleteEmployee(String employeeId);
	public List<Employee> employeeDetails();
	public String updatePassword(Employee employee);
	public String updateProject(Employee employee,String employeeId);
	public List<Employee> findByProjectName(String projectName);
	
}
