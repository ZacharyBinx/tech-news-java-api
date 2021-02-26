package com.technews.technewsjavaapi.repository;

import java.util.List;

import com.technews.technewsjavaapi.model.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{
    List<Comment> findAllCommentsByPostId(int postId) throws Exception;
}
