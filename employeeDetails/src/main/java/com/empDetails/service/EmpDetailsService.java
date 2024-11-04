package com.empDetails.service;

import java.util.List;

import com.empDetails.entity.EmployeeDetails;

public interface EmpDetailsService {

	//Saves all employee details
	public List<EmployeeDetails> saveEmpsDetails(List<EmployeeDetails> employeeDetails);
	//gets all employees details
	public List<EmployeeDetails> readAllEmpDetails();
	//gets an employee details by id
	public EmployeeDetails readEmpDetailsById(int id);
	//deletes an employee details using id
	public String deleteEmpDetails(int id);
	//updates employee details using id
	public EmployeeDetails updateEmpDetails(EmployeeDetails employeeDetails);
}
