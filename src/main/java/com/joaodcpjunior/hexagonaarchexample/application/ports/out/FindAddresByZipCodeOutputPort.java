package com.joaodcpjunior.hexagonaarchexample.application.ports.out;

import com.joaodcpjunior.hexagonaarchexample.application.core.domain.Address;

public interface FindAddresByZipCodeOutputPort {

    Address find(String zipCode);
}

