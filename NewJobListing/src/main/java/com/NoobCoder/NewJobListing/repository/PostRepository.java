package com.NoobCoder.NewJobListing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.NoobCoder.NewJobListing.model.Post;

public interface PostRepository extends MongoRepository<Post , String>
{
	//This will handle all the CRUD Operations
}
