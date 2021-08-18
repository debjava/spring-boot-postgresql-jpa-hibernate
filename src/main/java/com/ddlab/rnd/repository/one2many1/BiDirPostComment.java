package com.ddlab.rnd.repository.one2many1;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity(name = "BiDirPostComment")
@Table(name = "bidirpost_comment")
public class BiDirPostComment {

	@Id
	@GeneratedValue
	private Long id;

	private String review;

	// Constructors, getters and setters removed for brevity

	public BiDirPostComment() {

	}

	public BiDirPostComment(String review) {
		this.review = review;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
    private BiDirPost post;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public BiDirPost getPost() {
		return post;
	}

	public void setPost(BiDirPost post) {
		this.post = post;
	}
	
	
}