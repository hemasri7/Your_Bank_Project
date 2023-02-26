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

import com.axis.model.JobVacancies;
import com.axis.service.JobVacanciesService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v4")
public class JobVacanciesController {

	@Autowired
	JobVacanciesService jobsService;
	
	@GetMapping("/all")
	public ResponseEntity<List<JobVacancies>> getAll(){
		return new ResponseEntity<List<JobVacancies>>(jobsService.getAll(),HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<JobVacancies> add(@RequestBody JobVacancies jobs){
		return new ResponseEntity<JobVacancies>(jobsService.add(jobs),HttpStatus.OK);
	}
	@PutMapping("/edit")
	public ResponseEntity<JobVacancies> edit(@RequestBody JobVacancies jobs ){
		return new ResponseEntity<JobVacancies>(jobsService.edit(jobs),HttpStatus.OK);	
	}
	@DeleteMapping("/delete/{jobId}")
	public ResponseEntity<String> deleteJob(@PathVariable String jobId){
		return new ResponseEntity<String>(jobsService.delete(jobId),HttpStatus.OK);
	}
//	@DeleteMapping("/delet/{jobid}")
//	public ResponseEntity<String> deleteJobbyId(@PathVariable String jobid){
//		return new ResponseEntity<String>(jobsService.delete(projectname),HttpStatus.OK);
//	}
	@GetMapping("/jobs/{jobId}")
	public ResponseEntity<JobVacancies> getJobs(@PathVariable String jobId){
		return new ResponseEntity<JobVacancies>(jobsService.getJobById(jobId),HttpStatus.OK);
	}
	
	@GetMapping("/job/{projectname}")
	public ResponseEntity<List<JobVacancies>> getJobByProject(@PathVariable String projectname){
		return new ResponseEntity<List<JobVacancies>> (jobsService.findByProjectname(projectname),HttpStatus.OK);
	}
}
