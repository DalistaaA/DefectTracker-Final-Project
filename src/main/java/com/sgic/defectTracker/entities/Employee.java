package com.sgic.defectTracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "employee")
public class Employee {

	@Id
	@Column(name = "employee_id") // Define Column Name for Database
	private String employeeId; // Initialize Variable for Attribute of Table

	@Column(name = "employee_name") // Define Column Name for Database
	private String employeeName; // Initialize Variable for Attribute of Table

	@Column(name = "designation") // Define Column Name for Database
	private String designation; // Initialize Variable for Attribute of Table

	@Column(name = "email") // Define Column Name for Database
	private String email; // Initialize Variable for Attribute of Table


	public String getEmployeeId() { // Getter Method for EmployeeId
		return employeeId;
	}

	public void setEmployeeId(String employeeId) { // Setter Method for EmployeeId
		this.employeeId = employeeId;
	}

	public String getEmployeeName() { // Getter Method for EmployeeName
		return employeeName;
	}

	public void setEmployeeName(String employeeName) { // Setter Method for EmployeeName
		this.employeeName = employeeName;
	}

	public String getDesignation() { // Getter Method for Designation
		return designation;
	}

	public void setDesignation(String designation) { // Setter Method for Designation
		this.designation = designation;
	}

	public String getEmail() { // Getter Method for Email
		return email;
	}

	public void setEmail(String email) { // Setter Method for Email
		this.email = email;
	}

	

}
