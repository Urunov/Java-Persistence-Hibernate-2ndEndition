package com.urunov.model.simple;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @Author: apple
 * @created on 14/09/2020
 * @Project is BillingSystem
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Bid {

    @Id
    @GeneratedValue   // (generator = Constants.ID_GENERATOR) which in book representing, however I use manually like
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)  // default Eager
    @JoinColumn(name = "ID", nullable = false)
    protected Item item;

    @NotNull
    protected BigDecimal amount;


    public Bid(BigDecimal bidAmount, Item item) {
    }
}
