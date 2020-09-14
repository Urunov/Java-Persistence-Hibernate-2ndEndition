package com.urunov.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: apple
 * @created on 14/09/2020
 * @Project is BillingSystem
 */

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    private Long addressId;
    private String street;
    private String zipCode;
    private String city;
}
