package com.example.Projection;

import org.springframework.beans.factory.annotation.Value;

public interface PersonView {

    String getFirstName();

    String getLastName();

    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullName();
}