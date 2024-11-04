package com.example.SpringCrud.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	private String customerName;
	private String customerLocation;
	private long customerContact;
	private String customerEmail;

	/*
	 * @OneToMany
	 * 
	 * @JoinColumn private Address addressId;
	 * 
	 * @OneToMany
	 * 
	 * @JoinColumn private Order orderId;
	 */
	
	public CustomerDetails(long customerId, String customerName, String customerLocation, long customerContact,
			String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
		this.customerContact = customerContact;
		this.customerEmail = customerEmail;
	}
	
	
	
	public CustomerDetails() {
		super();
	}



	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
	
	
}
