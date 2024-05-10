package com.mnaco.joblisting.repository;

import com.mnaco.joblisting.model.Post;

import java.util.List;

public interface ISearch {
    List<Post> findByText(String text);
}
