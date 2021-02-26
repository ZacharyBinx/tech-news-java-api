package com.technews.technewsjavaapi.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "vote")
public class Vote implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer postId;

    public Vote() {
    }

    public Vote(Integer id, 
                Integer userId, 
                Integer postId) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setPostID(Integer postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vote)) {
            return false;
        }
        Vote vote = (Vote) o;
        return Objects.equals(getId(), vote.getId()) && 
               Objects.equals(getUserId(), vote.getUserId()) && 
               Objects.equals(getPostId(), vote.getPostId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUserId(), getPostId());
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", userId='" + userId + "'" +
            ", postId='" + postId + "'" +
            "}";
    }
}
