package com.urunov.model.simple;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: apple (@urunov)
 * @created on 14/09/2020
 * @Project is BillingSystem
 */

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@Embeddable
public class Address {

    @NotNull // Ignored for DLL generation
    @Column(nullable = false) // Used for DLL generation!
    private String street;

    @NotNull
    @Column(nullable = false, length = 5)
    protected String zipCode;

    @NotNull
    @Column(nullable = false)
    private String city;

    /**
     * Hibernate will call this no-argument constructor to create an instance, and then
     * populate the fields directly.
     */
    protected Address() {
    }
}
