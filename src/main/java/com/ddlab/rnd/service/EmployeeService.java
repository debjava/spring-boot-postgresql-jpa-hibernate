package com.ddlab.rnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.Employee;
import com.ddlab.rnd.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public void createEmployee(Employee emp) {
		empRepo.save(emp);
	}
	
	public Employee getById(Long id) {
		return empRepo.findById(id).get();
	}
	
	public Employee getByName(String name) {
		return empRepo.findByName(name);
	}
	
	public long getTotalEmployees() {
		return empRepo.getTotalNoEmployees();
	}
	
	public void changeEmployeeName(Long id, String name) {
		empRepo.changeName(id, name);
	}
	
	public void insertEmployee(long id, String name, String address, String project_name) {
		empRepo.insertEmployee(id, name, address, project_name);
	}
	
	public void changeAddress(String address, String name) {
		empRepo.updateEmployeeSetAddressForNative(address, name);
	}
}
