package com.axis.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.Posts;
import com.axis.repository.PostsRepository;
@Service
public class PostServiceImpl implements PostService{
	@Autowired
	PostsRepository postRepository;

	@Override
	public Posts addPost(Posts post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);
	}

	@Override
	public List<Posts> viewPosts() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	public Posts editpost(Posts post, String id) {
		// TODO Auto-generated method stub
		Posts post1=postRepository.findById(id).orElseThrow();
		post1.setDesc(post.getDesc());
		post1.setImg(post.getImg());
		post1.setLikes(post.getLikes());
		return postRepository.save(post1);
	}

	@Override
	public String deletePost(String id) {
		// TODO Auto-generated method stub
		Posts post1=postRepository.findById(id).orElseThrow();
		if(post1!=null) {
			postRepository.delete(post1);
			return "Deleted successfully";
		}
		else {
			return "No Data found";
		}
		
	}

	@Override
	public Posts findById(String id) {
		// TODO Auto-generated method stub
		return postRepository.findById(id).orElseThrow();
	}

//	@Override
//	public String addComment(String id, Posts post) {
//		// TODO Auto-generated method stub
//		Posts post1=postRepository.findById(id).orElseThrow();
//		post1.getDesc().add(post.getDesc());
//		postRepository.save(post1);
//    	return "commented added";
//	}

	@Override
	public Posts addComment(Posts post) {
		// TODO Auto-generated method stub
		Posts post1=postRepository.findById(post.getId()).orElseThrow();
		post1.getDesc().putAll(post.getDesc());
		
		return postRepository.save(post1);
		
	}

//	@Override
//	public String addComment(Map<String, String> desc,String id) {
//		Posts post=postRepository.findById(id).orElseThrow();
//		post.getDesc().putAll(desc);
//		// TODO Auto-generated method stub
//		postRepository.save(post);
//		return desc.get(desc.keySet().toArray()[0])+"commented";
//	}

}
