package com.ddlab.rnd.repository.one2many1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "PostComment")
@Table(name = "post_comment")
public class PostComment {

	@Id
	@GeneratedValue
	private Long id;

	private String review;

	// Constructors, getters and setters removed for brevity

	public PostComment() {

	}

	public PostComment(String review) {
		this.review = review;
	}
}