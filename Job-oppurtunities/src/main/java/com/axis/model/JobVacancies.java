package com.axis.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="vacancies")
public class JobVacancies {
	@Id
	private String jobId;
	private String projectname;
	private String designation;
	private String requiredSkils;
	private String jobDesc;
	private int experience;
	public JobVacancies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobVacancies(String jobId, String projectname, String designation, String requiredSkils, String jobDesc,
			int experience) {
		super();
		this.jobId = jobId;
		this.projectname = projectname;
		this.designation = designation;
		this.requiredSkils = requiredSkils;
		this.jobDesc = jobDesc;
		this.experience = experience;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getRequiredSkils() {
		return requiredSkils;
	}
	public void setRequiredSkils(String requiredSkils) {
		this.requiredSkils = requiredSkils;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
}
