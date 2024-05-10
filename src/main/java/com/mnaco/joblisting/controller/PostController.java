package com.mnaco.joblisting.controller;

import com.mnaco.joblisting.model.Post;
import com.mnaco.joblisting.repository.IPost;
import com.mnaco.joblisting.repository.ISearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    IPost repo;

    @Autowired
    ISearch srepo;

    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
    @GetMapping("/allPosts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }
    // posts/java
    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }


}
