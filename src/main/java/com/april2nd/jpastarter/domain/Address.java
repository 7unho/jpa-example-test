package com.april2nd.jpastarter.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable // jpa 내장 ?를 쓰겠다
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
