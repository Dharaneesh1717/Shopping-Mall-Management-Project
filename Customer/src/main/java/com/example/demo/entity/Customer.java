package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;
	private String customerName;
	private Long customerPhn;
	private String customerEmail;
	public Customer() {
	}
	public Customer(Long customerId, String customerName, Long customerPhn, String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhn = customerPhn;
		this.customerEmail = customerEmail;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getCustomerPhn() {
		return customerPhn;
	}
	public void setCustomerPhn(Long customerPhn) {
		this.customerPhn = customerPhn;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhn=" + customerPhn
				+ ", customerEmail=" + customerEmail + "]";
	}
	
	

}