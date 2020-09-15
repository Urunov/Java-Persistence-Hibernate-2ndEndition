package com.urunov.model.bulkbatch;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: apple
 * @created on 14/09/2020
 * @Project is BillingSystem
 */

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CreditCard extends BillingDetails{

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String CardNumber;

    @NotNull
    private String expMonth;

    @NotNull
    private String expYear;
}
