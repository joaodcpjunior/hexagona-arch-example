package com.joaodcpjunior.hexagonaarchexample.adapters.out.repository;

import com.joaodcpjunior.hexagonaarchexample.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
