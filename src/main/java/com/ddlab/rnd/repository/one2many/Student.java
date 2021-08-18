package com.ddlab.rnd.repository.one2many;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

//	@OneToMany(orphanRemoval = true,cascade = { CascadeType.ALL })
//	@JoinColumn(name = "student_id")
//	@OneToMany(targetEntity = Subject.class)
//	@OneToMany(mappedBy = "student", cascade = CascadeType.MERGE)
	@OneToMany(mappedBy = "student", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private Set<Subject> subjects = new HashSet<Subject>();
	
	public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;

        for(Subject b : subjects) {
            b.setStudent(this);
        }
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

//	public void setSubjects(Set<Subject> subjects) {
//		this.subjects = subjects;
//	}
	
	

}
