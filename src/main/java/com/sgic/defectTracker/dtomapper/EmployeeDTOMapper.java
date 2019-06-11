package com.sgic.defectTracker.dtomapper;

import java.lang.reflect.Type;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.defectTracker.dtos.EmployeeDTO;
import com.sgic.defectTracker.entities.Employee;
import com.sgic.defectTracker.services.EmployeeService;

@Service
public class EmployeeDTOMapper {

	@Autowired
	private EmployeeService employeeService; // Create Object for EmployeeService

	ModelMapper modelMapper = new ModelMapper(); // Create ModelMapper Object

	
	@SuppressWarnings("unused")
	private EmployeeDTO EntityToDTO(Employee employee) { // Convert Entity Class To DTO Class
		EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
		return employeeDTO;
	}
	
	public Employee saveEmployeeOfMapper(EmployeeDTO employeeDTO){ // Save Method For EmployeeMapper
		Employee employee = modelMapper.map(employeeDTO, Employee.class);
		return employeeService.saveEmployee(employee); // Call Save Method from EmployeeService
	}
	
	public List<EmployeeDTO> getAllEmployee(){ // List Method for EmployeeMapper
		List<Employee> employee = employeeService.listEmployeeInfo(); // Call View Method from EmployeeService
		Type listType = new TypeToken<List<EmployeeDTO>>() {}.getType(); 
		List<EmployeeDTO> getEmployeelist = new ModelMapper().map(employee, listType);
		return getEmployeelist;	
	}
	
	public EmployeeDTO getEmployee(String employeeId) { // ViewOneEmployee Method for EmployeeMapper
		return EntityToDTO(employeeService.getEmployeeById(employeeId)); // Call getById Method from EmployeeService
	}

	public EmployeeDTO deleteEmployee(String employeeId) { // DeleteEmployee method for EmployeeDTOMapper
		employeeService.deleteEmployeeById(employeeId); // Call deleteEmployeeById method from EmployeeService
		return null;	
	}
	
	public void updateEmployeeOfMapper(EmployeeDTO employeeDTO) { // UpadteEmployee method for EmployeeMapper
		Employee employee = modelMapper.map(employeeDTO, Employee.class);
		EntityToDTO(employeeService.updateEmployee(employee)); 
	}
}
