package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface Customerservice {

	public Customer saveCustomer(Customer customer);

	public Customer fetchCustomerById(Long customerId);

	public List<Customer> fetchCustomerList();

	public void deleteCustomerById(Long customerId);

	public Customer updateCustomer(Long customerId, Customer customer);
	

}

