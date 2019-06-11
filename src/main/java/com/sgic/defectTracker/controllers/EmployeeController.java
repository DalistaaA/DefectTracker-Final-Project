package com.sgic.defectTracker.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.defectTracker.dtomapper.EmployeeDTOMapper;
import com.sgic.defectTracker.dtos.EmployeeDTO;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDTOMapper employeeDTOMapper; // Create Object for EmployeeDTOMapper

	@PostMapping("/saveEmployee")
	public HttpStatus saveEmployees(@Valid @RequestBody EmployeeDTO employeeDTO) { // Save Method for Controller
		employeeDTOMapper.saveEmployeeOfMapper(employeeDTO); // Call Save Method from EmployeeDTOMapper
		return HttpStatus.CREATED; // Visible Message, If Method Work Properly

	}
	
	@GetMapping("/listEmployees") 
	public List<EmployeeDTO> getAllEmployees(){ // ViewAllEmployee Method for Controller
		return employeeDTOMapper.getAllEmployee();
		
	}
	
	@GetMapping("/getEmployeeInfo/{employeeId}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("employeeId") String employeeId){// ViewAllEmployee Method for Controller
		return new ResponseEntity<EmployeeDTO>(employeeDTOMapper.getEmployee(employeeId),HttpStatus.OK);	
	}
	
	@DeleteMapping("/deleteEmployee/{employeeId}")
	public ResponseEntity<EmployeeDTO> deleteEmployeeById(@PathVariable("employeeId") String employeeId){ // DeleteEmployee method for Controller
		return new ResponseEntity<EmployeeDTO>(employeeDTOMapper.deleteEmployee(employeeId),HttpStatus.OK);
	}
	
	@PutMapping("updateEmployee/{employeeId}")
	public ResponseEntity<EmployeeDTO> updateEmployeeById(@Valid @RequestBody EmployeeDTO employeeDTO){ // Update Employee method for Controller
		employeeDTOMapper.updateEmployeeOfMapper(employeeDTO);
		return new ResponseEntity<EmployeeDTO>(employeeDTO,HttpStatus.OK);	
	}
}
