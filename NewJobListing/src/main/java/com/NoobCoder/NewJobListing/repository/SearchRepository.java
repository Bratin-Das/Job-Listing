package com.NoobCoder.NewJobListing.repository;

import java.util.List;

import com.NoobCoder.NewJobListing.model.Post;

public interface SearchRepository
{
	List<Post> findByText(String text);
}
