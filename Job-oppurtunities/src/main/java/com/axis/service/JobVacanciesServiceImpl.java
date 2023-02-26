package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.JobVacancies;
import com.axis.repositroy.JobVacanciesRepository;

@Service
public class JobVacanciesServiceImpl implements JobVacanciesService{

	@Autowired
	JobVacanciesRepository jobsRepository;
	@Override
	public List<JobVacancies> getAll() {
		// TODO Auto-generated method stub
		return jobsRepository.findAll();
	}

	@Override
	public List<JobVacancies> findByProjectname(String projectname) {
		// TODO Auto-generated method stub
		List<JobVacancies> jobs=jobsRepository.findByProjectname(projectname);
		return jobs;
	}

	@Override
	public JobVacancies add(JobVacancies jobs) {
		// TODO Auto-generated method stub
		return jobsRepository.save(jobs);
	}

	@Override
	public JobVacancies edit(JobVacancies jobs) {
		// TODO Auto-generated method stub
		JobVacancies job=jobsRepository.findById(jobs.getJobId()).orElseThrow();
		job.setProjectname(jobs.getProjectname());
		job.setDesignation(jobs.getDesignation());
		job.setExperience(jobs.getExperience());
		job.setRequiredSkils(jobs.getRequiredSkils());
		job.setJobDesc(jobs.getJobDesc());
		return jobsRepository.save(job);
	}

	@Override
	public String delete(String jobId) {
		// TODO Auto-generated method stub
		JobVacancies job=jobsRepository.findById(jobId).orElseThrow();
		if(job!=null) {
			jobsRepository.delete(job);
			return "Deleted successfully";
		}
		else {
			return "No Data Found With jobId";
		}
	}

	@Override
	public JobVacancies getJobById(String jobId) {
		// TODO Auto-generated method stub
		return jobsRepository.findById(jobId).orElseThrow();
	}

}
