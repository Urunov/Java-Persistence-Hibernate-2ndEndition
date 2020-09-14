package com.urunov.repository;

import com.urunov.model.BillingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: apple
 * @created on 14/09/2020
 * @Project is BillingSystem
 */
public interface BillingRepository extends JpaRepository<BillingDetails, Long> {
}
