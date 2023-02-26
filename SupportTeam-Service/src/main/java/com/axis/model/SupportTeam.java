package com.axis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="support")
public class SupportTeam {
	
	@Id
	private String id;
	private String name;
	private String projectname;
	private String designation;
	private String email;
	private Long phoneno;
	private String imageUrl;
	
	public SupportTeam(String id, String name, String projectname, String designation, String email, Long phoneno,String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.projectname = projectname;
		this.designation = designation;
		this.email = email;
		this.phoneno = phoneno;
		this.imageUrl=imageUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public SupportTeam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	
}
