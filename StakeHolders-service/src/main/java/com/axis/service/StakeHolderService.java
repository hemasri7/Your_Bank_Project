package com.axis.service;

import java.util.List;

import com.axis.model.StakeHolder;

public interface StakeHolderService {
	public StakeHolder addStakeHolder(StakeHolder stakeHolder);
	public List<StakeHolder> getAllStakeHolders();
	public StakeHolder getByStakeHolder(String id);
	public StakeHolder updateStakeHolder(String id,StakeHolder stakeHolder);
	public String deleteStakeHolder(String id);
	public StakeHolder searchByName(String name);

}
