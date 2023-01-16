package com.april2nd.jpastarter.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id // PK
    @GeneratedValue // Auto increment
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded // @Embedable과 단짝.. 알아보기
    private Address address;

    // 나는 연관관계 주인이 아니다.
    // order의 member가 주인이다.
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();


}
