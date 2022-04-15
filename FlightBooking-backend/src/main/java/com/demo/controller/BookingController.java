package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.controller.dto.BookingFormDto;
import com.demo.service.BookingService;


@RestController
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/book")
	public String bookAppointment(@RequestBody BookingFormDto bookingFormDto) {
		return bookingService.bookFlight(bookingFormDto);
		
	}
}
