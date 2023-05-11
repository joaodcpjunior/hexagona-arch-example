package com.joaodcpjunior.hexagonaarchexample.adapters.out.client.mapper;

import com.joaodcpjunior.hexagonaarchexample.adapters.out.client.response.AddressResponse;
import com.joaodcpjunior.hexagonaarchexample.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address addressResponseToAddress(AddressResponse addressResponse);

}
