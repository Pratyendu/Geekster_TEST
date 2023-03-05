package com.test.thFeb.Model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
