package com.urunov.model.simple;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.urunov.model.Constants;
/**
 * @Author: apple
 * @created on 14/09/2020
 * @Project is BillingSystem
 */

@Data
@Getter
@Setter
@Entity
public class Category {

    @Id
    @GeneratedValue(generator = Constants.ID_GENERATOR) /* just use default for generate ID

    Please, dont confuse strategy and generator...
    generator = Constants.ID_GENERATOR which we make our own interface.
    */
    private Long id;

    protected String name;


}
