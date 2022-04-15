package com.demo.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.demo.entity.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer,Long> {

}
