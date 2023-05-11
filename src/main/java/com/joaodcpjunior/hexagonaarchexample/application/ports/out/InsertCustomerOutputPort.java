package com.joaodcpjunior.hexagonaarchexample.application.ports.out;

import com.joaodcpjunior.hexagonaarchexample.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
