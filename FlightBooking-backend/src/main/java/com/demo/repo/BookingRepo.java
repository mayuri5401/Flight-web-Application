package com.demo.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Booking;


@Repository
public interface BookingRepo extends MongoRepository<Booking,Long> {

}

