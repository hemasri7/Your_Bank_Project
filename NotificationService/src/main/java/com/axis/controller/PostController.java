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

import com.axis.model.Posts;
import com.axis.service.PostService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v8")
public class PostController {

	@Autowired
	PostService postService;
	
	@GetMapping("/posts")
	public ResponseEntity<List<Posts>> getAll(){
		return new ResponseEntity<List<Posts>>(postService.viewPosts(),HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Posts> addpost(@RequestBody Posts post){
		return new ResponseEntity<Posts>(postService.addPost(post),HttpStatus.OK);
	}
	@PutMapping("/edit")
	public ResponseEntity<Posts> editPost(@RequestBody Posts post,@PathVariable String id) {
		return new ResponseEntity<Posts>(postService.editpost(post, id),HttpStatus.OK);
		
	}
	@PostMapping("/comment")
	public ResponseEntity<Posts> addComment(@RequestBody Posts post){
		return new ResponseEntity<Posts>(postService.addComment( post),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public  ResponseEntity<String> deletePost(@PathVariable String id){
		return new ResponseEntity<String>(postService.deletePost(id),HttpStatus.OK);
	}
}
