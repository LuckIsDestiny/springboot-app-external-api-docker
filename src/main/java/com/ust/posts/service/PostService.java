package com.ust.posts.service;

import com.ust.posts.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    private final RestTemplate restTemplate;

    public PostService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public List<Post> getPosts() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        Post[] posts = restTemplate.getForObject(url, Post[].class);
        return Arrays.asList(posts);
    }

    public Post getPost(int userId){
        String url = "https://jsonplaceholder.typicode.com/posts/" + userId;
        return restTemplate.getForObject(url, Post.class);
    }
}
