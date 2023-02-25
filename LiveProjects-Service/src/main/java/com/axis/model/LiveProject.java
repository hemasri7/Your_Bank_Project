package com.axis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class LiveProject {
	@Id
	private String projId;
	private String projName;
	private String projDescription;
	private String projOwner;
	private String projOwnerDescription;
	private String projOwnerImg;
	private String projImg;
	private String projFlowChartImg;
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getProjDescription() {
		return projDescription;
	}
	public void setProjDescription(String projDescription) {
		this.projDescription = projDescription;
	}
	public String getProjOwner() {
		return projOwner;
	}
	public void setProjOwner(String projOwner) {
		this.projOwner = projOwner;
	}
	public String getProjOwnerImg() {
		return projOwnerImg;
	}
	public void setProjOwnerImg(String projOwnerImg) {
		this.projOwnerImg = projOwnerImg;
	}
	public String getProjImg() {
		return projImg;
	}
	public void setProjImg(String projImg) {
		this.projImg = projImg;
	}
	public String getProjFlowChartImg() {
		return projFlowChartImg;
	}
	public void setProjFlowChartImg(String projFlowChartImg) {
		this.projFlowChartImg = projFlowChartImg;
	}
	
	public String getProjOwnerDescription() {
		return projOwnerDescription;
	}
	public void setProjOwnerDescription(String projOwnerDescription) {
		this.projOwnerDescription = projOwnerDescription;
	}
	public LiveProject(String projId, String projName, String projDescription, String projOwner,
			String projOwnerDescription,String projOwnerImg, String projImg, String projFlowChartImg) {
		super();
		this.projId = projId;
		this.projName = projName;
		this.projDescription = projDescription;
		this.projOwner = projOwner;
		this.projOwnerDescription=projOwnerDescription;
		this.projOwnerImg = projOwnerImg;
		this.projImg = projImg;
		this.projFlowChartImg = projFlowChartImg;
	}
	public LiveProject() {
		super();
	}
	
	
	
}
