package com.joaodcpjunior.hexagonaarchexample.adapters.out;

import com.joaodcpjunior.hexagonaarchexample.adapters.out.client.FindAddressByZipCodeClient;
import com.joaodcpjunior.hexagonaarchexample.adapters.out.client.mapper.AddressResponseMapper;
import com.joaodcpjunior.hexagonaarchexample.application.core.domain.Address;
import com.joaodcpjunior.hexagonaarchexample.application.ports.out.FindAddresByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddresByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.addressResponseToAddress(addressResponse);
    }
}
