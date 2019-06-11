package com.sgic.defectTracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.defectTracker.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> { // Inherit to the JpaRepository
	
	Employee findEmployeeByEmployeeId(String employeeId); // Find One Employee Record Method 

	
}
