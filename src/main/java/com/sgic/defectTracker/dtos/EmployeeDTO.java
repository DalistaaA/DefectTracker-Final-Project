package com.sgic.defectTracker.dtos;

public class EmployeeDTO {
	//Initialize Variable for Attribute
	private String employeeId;   
	private String employeeName;
	private String designation;
	private String email;
	

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
