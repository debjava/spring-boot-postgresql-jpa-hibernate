//package com.ddlab.rnd.repository.one2many;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "organization")
//public class Organization {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "orgId")
//    private Long id;
//	private String name;
//	
//	@OneToMany(mappedBy = "project", cascade = { CascadeType.ALL })
////	@JoinColumn(name = "projId")
//	private List<Project> projects;
//	
//}
