package com.example.Projection;

import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person, Long> {

    PersonView findByLastName(String lastName);
    PersonDto findByFirstName(String firstName);
    <T> T findByLastName(String lastName, Class<T> type);


}
