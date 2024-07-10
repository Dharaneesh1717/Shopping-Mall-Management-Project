package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.Customerrepository;
@Service
public class Customerserviceimpl implements Customerservice{
	@Autowired
	Customerrepository cr;

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cr.save(customer);
	}

	@Override
	public Customer fetchCustomerById(Long customerId) {
		// TODO Auto-generated method stub
		return cr.findById(customerId).get();
	}

	@Override
	public List<Customer> fetchCustomerList() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public void deleteCustomerById(Long customerId) {
		// TODO Auto-generated method stub
		cr.deleteById(customerId);
		
	}

	@Override
	public Customer updateCustomer(Long customerId, Customer customer) {
		// TODO Auto-generated method stub
		Customer c = cr.findById(customerId).get();
		
		if(Objects.nonNull(customer.getCustomerName()) &&
	    !"".equalsIgnoreCase(customer.getCustomerName())) {
			c.setCustomerName(customer.getCustomerName());
        }
		
		if (Objects.nonNull(customer.getCustomerPhn())) {
		    c.setCustomerPhn(customer.getCustomerPhn());

		}


	       if(Objects.nonNull(customer.getCustomerEmail()) &&
	               !"".equalsIgnoreCase(customer.getCustomerEmail())) {
	           c.setCustomerEmail(customer.getCustomerEmail());
	       }
		return cr.save(c);
	}
	

}
