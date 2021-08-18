package com.ddlab.rnd.repository.one2many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	public void storeStudent(Student student) {
		studentRepo.save(student);
	}

}
