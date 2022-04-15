package com.demo.service;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.demo.entity.Flight;
@Service
public interface FlightService extends  MongoRepository<Flight,Long> {

}
