package com.april2nd.jpastarter.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter@Setter
public class Delievery {
    @Id @GeneratedValue
    @Column(name = "delievery_id")
    private Long id;

    @OneToOne(mappedBy = "delievery")
    private Order order;

    @Embedded
    private Address address;

    // EnumType.ORDINAL = 숫자로 들어김. -> 중간에 다른 상태가 추가되면 꼬일 수 있다.
    @Enumerated(EnumType.STRING)
    private DelieveryStatus status;
}
