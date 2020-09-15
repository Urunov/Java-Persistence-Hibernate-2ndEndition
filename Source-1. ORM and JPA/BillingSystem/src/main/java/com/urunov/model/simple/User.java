package com.urunov.model.simple;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * @Author: apple
 * @created on 14/09/2020
 * @Project is BillingSystem
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "Users")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long userId;

    private String userName;
    private String homeAddress;
    @Embedded  // Not important, but for practical case
    @AttributeOverrides({
            @AttributeOverride(name = "street",
                    column = @Column(name = "BILLING_STREET")), // NULLABLE
            @AttributeOverride(name = "zipcode",
                    column = @Column(name = "BILLING_ZIPCODE", length = 5)),
            @AttributeOverride(name = "city",
                    column = @Column(name = "BILLING_CITY"))
    })
    protected Address billingAddress;

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public BigDecimal calcShippingCosts(Address fromLocation) {
        // Empty implementation of business method

        return null;
    }


}
