package com.demo.service;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.demo.entity.Customer;

@Service
public interface CustomerService extends  MongoRepository<Customer,Long> {

}
