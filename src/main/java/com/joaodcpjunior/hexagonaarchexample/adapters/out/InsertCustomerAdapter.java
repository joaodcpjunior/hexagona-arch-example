package com.joaodcpjunior.hexagonaarchexample.adapters.out;

import com.joaodcpjunior.hexagonaarchexample.adapters.out.repository.CustomerRepository;
import com.joaodcpjunior.hexagonaarchexample.adapters.out.repository.mapper.CustomerEntityMapper;
import com.joaodcpjunior.hexagonaarchexample.application.core.domain.Customer;
import com.joaodcpjunior.hexagonaarchexample.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
