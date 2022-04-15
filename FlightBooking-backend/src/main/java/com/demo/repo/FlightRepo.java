package com.demo.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Flight;

@Repository
public interface FlightRepo extends MongoRepository<Flight,Long> {

}

