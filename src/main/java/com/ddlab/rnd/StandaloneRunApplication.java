package com.ddlab.rnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ddlab.rnd.repository.one2many1.BiDirPost;
import com.ddlab.rnd.repository.one2many1.BiDirPostComment;
import com.ddlab.rnd.repository.one2many1.BiDirPostService;

@SpringBootApplication
public class StandaloneRunApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StandaloneRunApplication.class, args);
		
//		Organization org = new Organization();
//		org.setName("Oracle Corp");
//		
//		List<Project> projList = new ArrayList<>();
//		
//		Project proj1 = new Project();
//		proj1.setName("Tiger Development");
//		
//		Project proj2 = new Project();
//		proj2.setName("Pandora App");
//		
//		projList.add(proj1);
//		projList.add(proj2);
//		
//		org.setProjects(projList);
		
		
//		OneToManyOrgService service = applicationContext.getBean(OneToManyOrgService.class);
//		
//		service.saveOrganisation(org);
		
//		Student student1 = new Student();
//		student1.setFirstName("Hari");
//		Student student2 = new Student();
//		student2.setFirstName("Vidya");
//
		
		// Uni-Directional
//		Post post = new Post("First post");
//		 
//		post.getComments().add(
//		    new PostComment("My first review")
//		);
//		post.getComments().add(
//		    new PostComment("My second review")
//		);
//		post.getComments().add(
//		    new PostComment("My third review")
//		);
//		PostService service = applicationContext.getBean(PostService.class);
//		service.savePost(post);
		
		
		
		// For BiDirectional
		BiDirPost post = new BiDirPost("First post");
		 
		post.addComment(
		    new BiDirPostComment("My first review")
		);
		post.addComment(
		    new BiDirPostComment("My second review")
		);
		post.addComment(
		    new BiDirPostComment("My third review")
		);
		
		BiDirPostService service = applicationContext.getBean(BiDirPostService.class);
		service.savePost(post);
		
		
	}

}
