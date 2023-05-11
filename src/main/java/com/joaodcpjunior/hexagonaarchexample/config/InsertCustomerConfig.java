package com.joaodcpjunior.hexagonaarchexample.config;

import com.joaodcpjunior.hexagonaarchexample.adapters.out.FindAddressByZipCodeAdapter;
import com.joaodcpjunior.hexagonaarchexample.adapters.out.InsertCustomerAdapter;
import com.joaodcpjunior.hexagonaarchexample.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);
    }
}
