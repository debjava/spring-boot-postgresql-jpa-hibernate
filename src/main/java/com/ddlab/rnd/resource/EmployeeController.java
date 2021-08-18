package com.ddlab.rnd.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ddlab.rnd.entity.Employee;
import com.ddlab.rnd.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/emp")
    public void addEmployee(@RequestBody Employee emp) {
		System.out.println("Emp : "+emp);
        empService.createEmployee(emp);
    }
	
	@GetMapping("/emp/{id}")
	public Employee getEmpById(@PathVariable Long id) {
		return empService.getById(id);
	}
	
	@GetMapping("/empName/{name}")
	public Employee getEmpById(@PathVariable String name) {
		return empService.getByName(name);
	}
	
	@GetMapping("/totalEmps")
	public long getTotalEmployees() {
		return empService.getTotalEmployees();
	}
	
	@PutMapping("emp/update")
	public void updateEmployeeName(@RequestParam("id") long id, @RequestParam("fullName") String fullName) {
		empService.changeEmployeeName(id, fullName);
	}
	
	@PostMapping("/insert")
	public void insertEmployee(@RequestBody Employee emp) {
		empService.insertEmployee(emp.getId(), emp.getName(), emp.getAddress(), emp.getProjectName());
	}
	
	@PutMapping("/update/address")
	public void updateAddress(@RequestParam("address") String address, @RequestParam("name") String name) {
		empService.changeAddress(address, name);
	}
	
}
