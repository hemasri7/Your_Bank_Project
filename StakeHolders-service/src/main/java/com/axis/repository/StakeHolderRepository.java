package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.model.StakeHolder;
@Repository
public interface StakeHolderRepository extends JpaRepository<StakeHolder,String>{
	public StakeHolder findByName(String name);

}
