package com.urunov.model.bulkbatch;

import com.sun.istack.NotNull;
import com.urunov.model.Constants;
import com.urunov.model.simple.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author: apple
 * @created on 14/09/2020
 * @Project is BillingSystem
 */

@Data
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BillingDetails {

    @Id
    @GeneratedValue(generator = Constants.ID_GENERATOR_POOLED) /// We may use constants interface
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    protected User user;

    @NotNull
    private String owner;

}
