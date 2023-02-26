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

import com.axis.model.StakeHolder;
import com.axis.service.StakeHolderService;


@RestController
@RequestMapping("/api/v2")
@CrossOrigin(origins="*")
public class StakeHolderController {
	
	@Autowired
	private StakeHolderService stakeHolderService;
	
	@PostMapping("/add")
	public ResponseEntity<StakeHolder> addStakeHolder(@RequestBody StakeHolder stakeHolder){
		StakeHolder st1=stakeHolderService.addStakeHolder(stakeHolder);
		return new ResponseEntity<StakeHolder>(st1,HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<StakeHolder>> getAllStakeHolders(){
		List<StakeHolder> list=stakeHolderService.getAllStakeHolders();
		return new ResponseEntity<List<StakeHolder>>(list,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<StakeHolder> getByStakeHolder(@PathVariable String id){
		StakeHolder st2=stakeHolderService.getByStakeHolder(id);
		return new ResponseEntity<StakeHolder>(st2,HttpStatus.OK);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<StakeHolder> updateStakeHolder(@PathVariable String id,@RequestBody StakeHolder stakeHolder){
		StakeHolder st3=stakeHolderService.updateStakeHolder(id, stakeHolder);
		return new ResponseEntity<StakeHolder>(st3,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStakeHolder(@PathVariable String id){
		String str=stakeHolderService.deleteStakeHolder(id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@GetMapping("/search/{name}")
	public ResponseEntity<StakeHolder> searchByName(@PathVariable String name){
		StakeHolder st4=stakeHolderService.searchByName(name);
		return new ResponseEntity<StakeHolder>(st4,HttpStatus.OK);
	}

}
