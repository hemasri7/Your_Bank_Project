package com.axis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.axis.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {
	public Employee findByEmployeeId(String employeeId);
	public Employee findByEmployeeIdAndPassword(String employeeId,String password);
	public List<Employee> findByProjectName(String projectName);
}
