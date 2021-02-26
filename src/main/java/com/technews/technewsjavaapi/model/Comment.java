package com.technews.technewsjavaapi.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "comment")
public class Comment implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String commentText;
    private Integer userId;
    private Integer postId;


    public Comment() {
    }

    public Comment(Integer id, 
                   String commentText, 
                   Integer userId, 
                   Integer postId) {
        this.id = id;
        this.commentText = commentText;
        this.userId = userId;
        this.postId = postId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentText() {
        return this.commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return this.postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) o;
        return Objects.equals(getId(), comment.getId()) && 
               Objects.equals(getCommentText(), comment.getCommentText()) && 
               Objects.equals(getUserId(), comment.getUserId()) && 
               Objects.equals(getPostId(), comment.getPostId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCommentText(), getUserId(), getPostId());
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", commentText='" + commentText + "'" +
            ", userId='" + userId + "'" +
            ", postId='" + postId + "'" +
            "}";
    }
}