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

import com.axis.model.LiveProject;
import com.axis.service.LiveProjectService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v5")
public class LiveProjectController {
	@Autowired
	private LiveProjectService liveProjectService;
	@PostMapping("/add")
	public ResponseEntity<LiveProject> add(@RequestBody LiveProject liveProject){
		return new ResponseEntity<LiveProject>(liveProjectService.add(liveProject),HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<LiveProject>> all(){
		return new ResponseEntity<List<LiveProject>>(liveProjectService.getall(),HttpStatus.OK);
	}
	@GetMapping("/getbyid/{projId}")
	public ResponseEntity<LiveProject> getByProj(@PathVariable String projId,@RequestBody LiveProject liveProject){
		return new ResponseEntity<LiveProject>(liveProjectService.getByProj(projId, liveProject),HttpStatus.OK);
	}
	@PutMapping("/update/{projId}")
	public ResponseEntity<LiveProject> update(@PathVariable String projId,@RequestBody LiveProject liveProject){
		return new ResponseEntity<LiveProject>(liveProjectService.update(projId, liveProject),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{projId}")
	public ResponseEntity<String> delete(@PathVariable String projId){
		return new ResponseEntity<String>(liveProjectService.delete(projId),HttpStatus.OK);
	}
	
	@GetMapping("/search/{projName}")
	public ResponseEntity<LiveProject> search(@PathVariable String projName){
		return new ResponseEntity<LiveProject>(liveProjectService.search(projName),HttpStatus.OK);
	}
	

}
