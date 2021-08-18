package com.ddlab.rnd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
    @GeneratedValue(generator = "employee_generator")
    @SequenceGenerator(
            name = "employee_generator", allocationSize = 1,
            sequenceName = "employee_generator",
            initialValue = 1000
    )
    private Long id;
	private String name;
	private String projectName;
	private String address;

}
