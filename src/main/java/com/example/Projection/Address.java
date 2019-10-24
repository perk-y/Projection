package com.example.Projection;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    private Long id;

    @OneToOne
    private Person person;

    private String state;

    private String city;

    private String street;

    private String zipCode;
}
