package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.StakeHolder;
import com.axis.repository.StakeHolderRepository;
@Service
public class StakeHolderServiceImpl implements StakeHolderService{
	@Autowired
	private StakeHolderRepository stakeHolderRepository;
	
	@Override
	public StakeHolder addStakeHolder(StakeHolder stakeHolder) {
		StakeHolder st1=stakeHolderRepository.save(stakeHolder);
		return st1;
	}

	@Override
	public List<StakeHolder> getAllStakeHolders() {
		List<StakeHolder> list=stakeHolderRepository.findAll();
		return list;
	}

	@Override
	public StakeHolder getByStakeHolder(String id) {
		StakeHolder st2=stakeHolderRepository.findById(id).orElseThrow();
		return st2;
	}

	@Override
	public StakeHolder updateStakeHolder(String id, StakeHolder stakeHolder) {
		StakeHolder st3=stakeHolderRepository.findById(id).orElseThrow();
		st3.setName(stakeHolder.getName());
		st3.setNo_of_shares(stakeHolder.getNo_of_shares());
		st3.setAddress(stakeHolder.getAddress());
		st3.setEmail(stakeHolder.getEmail());
		st3.setImageUrl(stakeHolder.getImageUrl());
		return stakeHolderRepository.save(st3);
	}

	@Override
	public String deleteStakeHolder(String id) {
		StakeHolder str=stakeHolderRepository.findById(id).orElseThrow();
		stakeHolderRepository.delete(str);
		return "Delete Successfully !!";
	}

	@Override
	public StakeHolder searchByName(String name) {
		StakeHolder search=stakeHolderRepository.findByName(name);
		return search;
	}

	

}
