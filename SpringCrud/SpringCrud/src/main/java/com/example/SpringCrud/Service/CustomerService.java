package com.example.SpringCrud.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringCrud.Entity.CustomerDetails;


public interface CustomerService {

	
	public List<CustomerDetails> saveCustomerDetails(List<CustomerDetails> customerDetails);
	
	public List<CustomerDetails> getCustomerDetails();
	
	public CustomerDetails updateCustomerDetails(CustomerDetails customerDetails);
	
	public String deleteCustomerDetails(long id);
}
