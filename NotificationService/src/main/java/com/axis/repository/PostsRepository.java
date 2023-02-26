package com.axis.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.axis.model.Posts;
@Repository
public interface PostsRepository extends MongoRepository<Posts,String>{
	//public Posts findById(String id);
}
