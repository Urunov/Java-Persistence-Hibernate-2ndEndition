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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BankAccount extends BillingDetails{

    @NotNull
    protected String account;

    @NotNull
    private String bankName;

    @NotNull
    private String swift;



}
