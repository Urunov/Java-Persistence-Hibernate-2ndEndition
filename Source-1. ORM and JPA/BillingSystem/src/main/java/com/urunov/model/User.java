package com.urunov.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;

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
public class User {

    @Id
    private Long userId;
    private String userName;
    private String address;

    private Set billingDetails;


}
