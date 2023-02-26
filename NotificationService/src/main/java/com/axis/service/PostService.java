package com.axis.service;

import java.util.List;
import java.util.Map;

import com.axis.model.Posts;

public interface PostService {
	public Posts addPost(Posts post);
	public List<Posts> viewPosts();
	public Posts editpost(Posts post,String id);
	public String deletePost(String id);
	public Posts findById(String id);
	public Posts addComment(Posts post);
	
}
