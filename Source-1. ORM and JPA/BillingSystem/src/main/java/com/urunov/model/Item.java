package com.urunov.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.NotFound;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

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
public class Item {

    @Id
    private Long id;

    @NotNull
    @Size(min=2, max=255, message = "Name is require, maximum 255 characters.")
    private String name;

    private BigDecimal initialPrice;

    @Future
    protected Date auctionEnd;
}
