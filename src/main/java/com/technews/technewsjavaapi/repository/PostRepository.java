package com.technews.technewsjavaapi.repository;

import java.util.List;

import com.technews.technewsjavaapi.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
    List<Post> findAllPostsByUserId(Integer id) throws Exception;
}
