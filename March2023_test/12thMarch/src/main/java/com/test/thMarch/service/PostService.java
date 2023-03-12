package com.test.thMarch.service;

import com.test.thMarch.dao.PostRepository;
import com.test.thMarch.model.Post;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public int savePost(Post post) {
        postRepository.save(post);
        return post.getId();
    }

    public List<Post> getAll() {
        List<Post> posts = postRepository.findAll();
        return posts;
    }

    public JSONArray getPosts(Integer id) {
        JSONArray jsonArray = new JSONArray();
        if (id != null){
            List<Post> posts = postRepository.getPostById(id);
            for(Post post : posts){
                JSONObject postObj = createResponse(post);
                jsonArray.put(postObj);
            }
        }else {
            List<Post> posts = postRepository.findAll();
            for(Post post : posts){
                JSONObject postObj = createResponse(post);
                jsonArray.put(postObj);
            }
        }
        return jsonArray;
    }

    private JSONObject createResponse(Post post) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id" , post.getId());
        jsonObject.put("title" , post.getTitle());
        jsonObject.put("description" , post.getDescription());

        return jsonObject;
    }
}
