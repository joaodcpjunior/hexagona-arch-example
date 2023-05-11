package com.joaodcpjunior.hexagonaarchexample.adapters.in.controller.mapper;

import com.joaodcpjunior.hexagonaarchexample.adapters.in.controller.request.CustomerRequest;
import com.joaodcpjunior.hexagonaarchexample.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer customerRequestToCustomer(CustomerRequest customerRequest);
}
