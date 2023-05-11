package com.joaodcpjunior.hexagonaarchexample.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "customers")
public class CustomerEntity {

    private String id;
    private String name;
    private AddressEntity addresEntity;
    private String cpf;
    private Boolean isValidCpf;
}
