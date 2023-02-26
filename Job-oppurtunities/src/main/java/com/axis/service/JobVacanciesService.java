package com.axis.service;

import java.util.List;

import com.axis.model.JobVacancies;

public interface JobVacanciesService {
	public List<JobVacancies> getAll();
	public List<JobVacancies> findByProjectname(String projectname);
	public JobVacancies add(JobVacancies jobs);
	public JobVacancies edit(JobVacancies jobs);
	public String delete(String jobId);
	public JobVacancies getJobById(String jobId);

}
