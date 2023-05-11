package com.joaodcpjunior.hexagonaarchexample.adapters.out.repository.mapper;

import com.joaodcpjunior.hexagonaarchexample.adapters.out.repository.entity.CustomerEntity;
import com.joaodcpjunior.hexagonaarchexample.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
