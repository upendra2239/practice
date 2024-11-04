package com.empDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empDetails.entity.EmployeeDetails;
import com.empDetails.service.EmpDetailsService;

@RestController
public class EmployeeDetailsController {
	
	@Autowired
	EmpDetailsService empDetailsService;

	
	@PostMapping("/saveAllDetails")
	public List<EmployeeDetails> saveAllDetails(@RequestBody List<EmployeeDetails> employeeDetails) {
		return empDetailsService.saveEmpsDetails(employeeDetails);
	}
	
	
	@GetMapping("/empDetails")
	public List<EmployeeDetails> empDetails() {
		return empDetailsService.readAllEmpDetails();
	}
	
	@GetMapping("/empDetailsById/{id}")
	public EmployeeDetails empDetailsById(@PathVariable int id) {
		return empDetailsService.readEmpDetailsById(id);
	}
	
	
	@PutMapping("/updateDetails")
	public EmployeeDetails updateDetails(@RequestBody EmployeeDetails employeeDetails) {
		return empDetailsService.updateEmpDetails(employeeDetails);
	}
	
	@DeleteMapping("/deleteDetails/{id}")
	public String deleteDetails(@PathVariable int id) {
		return empDetailsService.deleteEmpDetails(id);
	}
	
	
	
}
