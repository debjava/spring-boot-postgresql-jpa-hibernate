package com.ddlab.rnd.repository.one2many1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	
	@Autowired
	private PostRepo repo;
	
	public void savePost(Post post) {
		repo.save(post);
	}
}
