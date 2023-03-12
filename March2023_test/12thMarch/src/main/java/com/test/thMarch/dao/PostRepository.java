package com.test.thMarch.dao;

import com.test.thMarch.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post , Integer> {
    @Query(value = "select * from post where id = :id" , nativeQuery = true)
    public List<Post> getPostById(int id);
}
