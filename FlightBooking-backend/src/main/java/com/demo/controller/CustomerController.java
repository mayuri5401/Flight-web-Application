package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Customer;
import com.demo.service.CustomerService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	private CustomerService customerservice;
	
	@Autowired
	public void setCustomerservice(CustomerService customerservice) {
		this.customerservice = customerservice;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		return ResponseEntity.ok(customerservice.findAll());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerByID(@PathVariable Long id){
		return ResponseEntity.ok(customerservice.findById(id).orElse(null));
		
	}
	
	@PostMapping("/")
	public ResponseEntity<Customer> add(@RequestBody Customer c) {
		return ResponseEntity.ok(customerservice.save(c));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Customer> update(@RequestBody Customer c, @PathVariable Long id) {
		c.setCustID(id);
		return ResponseEntity.ok(customerservice.save(c));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Customer> delete(@PathVariable Long id) {
		customerservice.findById(id).ifPresent(customerservice::delete);
		return ResponseEntity.ok().build();
	}

}
