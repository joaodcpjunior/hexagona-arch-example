package com.joaodcpjunior.hexagonaarchexample.application.ports.in;

import com.joaodcpjunior.hexagonaarchexample.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
