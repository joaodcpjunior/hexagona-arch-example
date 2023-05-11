package com.joaodcpjunior.hexagonaarchexample.application.core.usecase;

import com.joaodcpjunior.hexagonaarchexample.application.core.domain.Customer;
import com.joaodcpjunior.hexagonaarchexample.application.ports.in.InsertCustomerInputPort;
import com.joaodcpjunior.hexagonaarchexample.application.ports.out.FindAddresByZipCodeOutputPort;
import com.joaodcpjunior.hexagonaarchexample.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddresByZipCodeOutputPort findAddresByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutPutPort;

    public InsertCustomerUseCase(FindAddresByZipCodeOutputPort findAddresByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutPutPort) {
        this.findAddresByZipCodeOutputPort = findAddresByZipCodeOutputPort;
        this.insertCustomerOutPutPort = insertCustomerOutPutPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddresByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutPutPort.insert(customer);
    }
}
