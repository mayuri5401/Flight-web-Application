package com.demo.service;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.controller.dto.BookingFormDto;
import com.demo.entity.Booking;
import com.demo.entity.Customer;
import com.demo.repo.BookingRepo;
import com.demo.repo.CustomerRepo;
//import com.demo.repo.FlightRepo;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
@Transactional
public class BookingService {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private BookingRepo bookingRepo;

	public String bookFlight(BookingFormDto bookingFormDto) {

		Customer c = new ObjectMapper().convertValue(bookingFormDto, Customer.class);

		Long custID = customerRepo.save(c).getCustID();

		System.out.println("Customer saved successfully.");

		Booking b = new Booking(custID,1L,new Date(System.currentTimeMillis()));

		Long bookingID = bookingRepo.save(b).getbID();

		return "Appointment Confirmed."+bookingID;
	}

}
