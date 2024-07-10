package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.Customerservice;
@RestController
public class Customercontroller {
	@Autowired
	Customerservice cs;
	@PostMapping("/customer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		
		return cs.saveCustomer(customer);
	}
    @GetMapping("/customer")
    public List<Customer> fetchCustomerList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return cs.fetchCustomerList();
    }
    


    @GetMapping("/customer/{id}")
    public Customer fetchCustomerById(@PathVariable("id") Long id)
            {
        return cs.fetchCustomerById(id);
    }
    
    @DeleteMapping("/customer/{id}")
    public String deleteCustomerById(@PathVariable("id") Long id) {
    	cs.deleteCustomerById(id);
        return "Customer deleted Successfully!!";
    }
    
    @PutMapping("/customer/{id}")
    public Customer updateCustomer(@PathVariable("id") Long id,
                                       @RequestBody Customer customer) {
        return cs.updateCustomer(id,customer);
    }

}
