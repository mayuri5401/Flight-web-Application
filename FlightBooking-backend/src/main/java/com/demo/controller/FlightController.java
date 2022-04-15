package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Flight;
import com.demo.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {
	
	private FlightService flightservice;
	
	@Autowired
	public void setCustomerservice(FlightService flightservice) {
		this.flightservice = flightservice;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Flight>> getAllFlight() {
		return ResponseEntity.ok(flightservice.findAll());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Flight> getFlightByID(@PathVariable Long id){
		return ResponseEntity.ok(flightservice.findById(id).orElse(null));
		
	}
	
	@PutMapping("/")
	public ResponseEntity<Flight> add(@RequestBody Flight f) {
		return ResponseEntity.ok(flightservice.save(f));
	}
	
	@PostMapping("/")
	public ResponseEntity<Flight> update(@RequestBody Flight f) {
		return ResponseEntity.ok(flightservice.save(f));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Flight> delete(@PathVariable Long id) {
		flightservice.findById(id).ifPresent(flightservice::delete);
		return ResponseEntity.ok().build();
	}

}
