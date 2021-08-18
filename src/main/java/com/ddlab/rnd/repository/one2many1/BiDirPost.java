package com.ddlab.rnd.repository.one2many1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity(name = "BiDirPost")
@Table(name = "bidirpost")
public class BiDirPost {
 
    @Id
    @GeneratedValue
    private Long id;
 
    private String title;
 
    @OneToMany(
            mappedBy = "post",// attribute from other class BiDirPostComment, ie. private BiDirPost post;
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
    private List<BiDirPostComment> comments = new ArrayList<>();
    
    public BiDirPost() {
    	
    }
    
    public BiDirPost(String title) {
    	this.title = title;
    }
 
    public void addComment(BiDirPostComment comment) {
        comments.add(comment);
        comment.setPost(this);
    }
 
    public void removeComment(BiDirPostComment comment) {
        comments.remove(comment);
        comment.setPost(null);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<BiDirPostComment> getComments() {
		return comments;
	}

	public void setComments(List<BiDirPostComment> comments) {
		this.comments = comments;
	}
    
    
}