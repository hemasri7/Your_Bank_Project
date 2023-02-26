package com.axis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.model.SupportTeam;

@Repository
public interface SupportTeamRepository extends JpaRepository<SupportTeam,String>{
	public List<SupportTeam> findByProjectname(String projectname);

}
