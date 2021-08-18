//package com.ddlab.rnd.repository.one2many;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "project")
//public class Project {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "projId")
//    private Long id;
//	private String name;
//	
//	@ManyToOne()
//	@JoinColumn(name = "orgId")
//	private Organization org;
//	
//}
