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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {

    @Id
    private Long ImageId;

    private String title;
    private String fileName;
}
