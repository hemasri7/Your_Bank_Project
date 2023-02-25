package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.EmployeeSalary;
import com.axis.repository.EmployeeSalaryRepository;

@Service
public class EmployeeSalaryServiceImpl implements EmployeeSalaryService{
	@Autowired
	private EmployeeSalaryRepository employeeRepo;
	
	@Override
	public EmployeeSalary addSalary(EmployeeSalary sal) {
		sal.setGrossSalary(sal.getMedical(), sal.getSpecial(), sal.getHouseRent(), sal.getBasicSal(), sal.getConveyance());
		sal.setTotalDeductions(sal.getEpf(), sal.getTax(), sal.getHealthInsurance());
		sal.setNetSal(sal.getGrossSalary(), sal.getTotalDeductions(),sal.getIncrement());
		return employeeRepo.save(sal);
	}

	@Override
	public List<EmployeeSalary> getAll() {
		return employeeRepo.findAll();
	}

	@Override
	public EmployeeSalary update(String employeeId,EmployeeSalary sal) {
		EmployeeSalary s1=employeeRepo.findById(employeeId).orElseThrow();
		s1.setEmail(sal.getEmail());
		s1.setBankName(sal.getBankName());
		s1.setAccountNo(sal.getAccountNo());
		s1.setBasicSal(sal.getBasicSal());
		s1.setMedical(sal.getMedical());
		s1.setHouseRent(sal.getHouseRent());
		s1.setEpf(sal.getEpf());
		s1.setTax(sal.getTax());
		s1.setIncrement(sal.getIncrement());
		s1.setHealthInsurance(sal.getHealthInsurance());
		s1.setYear(sal.getYear());
		s1.setMonth(sal.getMonth());
		s1.setConveyance(sal.getConveyance());
		s1.setSpecial(sal.getSpecial());
		return employeeRepo.save(s1);
	}

	@Override
	public String delete(String employeeId) {
		String str;
		EmployeeSalary s2=employeeRepo.findById(employeeId).orElseThrow();
		if(s2!=null) {
			employeeRepo.delete(s2);
			str="Deleted Successfully";
		}
		else {
			str="Failed";
		}
		return str;
	}

	@Override
	public EmployeeSalary search(String employeeId) {
		EmployeeSalary s3=employeeRepo.findById(employeeId).orElseThrow();
		return s3;
	}

}
