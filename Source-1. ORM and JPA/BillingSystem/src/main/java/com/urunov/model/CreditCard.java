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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CreditCard {

    @Id
    private Long CardId;

    private String number;
    private String expMonth;
    private String expYear;
}
