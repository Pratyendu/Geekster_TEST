package com.test.thMarch.controller;

import com.test.thMarch.model.Post;
import com.test.thMarch.service.PostService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/posts")
public class PostController {
    @Autowired
    PostService postService;
    @PostMapping(value = "create-post")
    public ResponseEntity<String> createPost(@RequestBody String postData){
        Post post = setPost(postData);
        int postId = postService.savePost(post);

        return new  ResponseEntity<String>("Post saved with id : " + postId , HttpStatus.CREATED);
    }

    @GetMapping(value = "get-post")
    public ResponseEntity<String> getPost(@Nullable @RequestParam Integer id){
        JSONArray postsArr = postService.getPosts(id);
        return new ResponseEntity<String>("Found post" + postsArr.toString() , HttpStatus.OK);

    }


    private Post setPost(String postData) {
        JSONObject postObj = new JSONObject(postData);
        Post post = new Post();
        post.setTitle(postObj.getString("title"));
        post.setDescription(postObj.getString("description"));

        return post;
    }
}
