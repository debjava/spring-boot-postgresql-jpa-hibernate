package com.ddlab.rnd.repository.one2many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity
@Table(name = "SUBJECT")
public class Subject {
	
	@Id
	@GeneratedValue
	@Column(name = "SUBJECT_ID")
	private long id;

	@Column(name = "NAME")
	private String name;

//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name = "student_id")
//	@ManyToOne
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
	private Student student;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
	

}
