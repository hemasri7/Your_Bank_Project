package com.axis.repositroy;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.axis.model.JobVacancies;

public interface JobVacanciesRepository extends MongoRepository<JobVacancies,String>{
	public List<JobVacancies> findByProjectname(String projectname);

}
