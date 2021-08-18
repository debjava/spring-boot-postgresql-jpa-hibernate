package com.ddlab.rnd.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ddlab.rnd.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query("FROM Employee p WHERE p.name = :name")
	Employee findByName(@Param("name") String name);
	
	@Query("SELECT COUNT(*) FROM Employee p")
	long getTotalNoEmployees();
	
	@Transactional
	@Modifying 
	// Make sure to add @Transactional annotation while adding @Modifying annotation otherwise it will throw
	// javax.persistence.TransactionRequiredException: Executing an update/delete query
	@Query("UPDATE Employee p SET p.name = :name WHERE p.id = :id")
	void changeName(@Param("id") long id, @Param("name") String name);
	
	@Transactional
	@Modifying
	@Query(
	  value = 
	    "insert into Employee (id, name, address, project_name) values (:id, :name, :address, :project_name)",
	  nativeQuery = true)
	void insertEmployee(@Param("id") long id, @Param("name") String name, 
			@Param("address") String address, @Param("project_name") String project_name);
	
	@Transactional
	@Modifying
	@Query(value = "update Employee e set address = ? where e.name = ?", nativeQuery = true)
	int updateEmployeeSetAddressForNative(String address, String name);

}
