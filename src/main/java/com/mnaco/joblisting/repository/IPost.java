package com.mnaco.joblisting.repository;

import com.mnaco.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPost extends MongoRepository<Post, String> {
}
