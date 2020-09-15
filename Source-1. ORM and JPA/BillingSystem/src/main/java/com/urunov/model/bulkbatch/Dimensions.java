package com.urunov.model.bulkbatch;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: apple
 * @created on 15/09/2020
 * @Project is BillingSystem
 */

@Data
public class Dimensions {

    private BigDecimal depth;
    private BigDecimal height;
    private BigDecimal width;


}
