package com.urunov.repository;

import com.urunov.model.bulkbatch.BillingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: apple
 * @created on 14/09/2020
 * @Project is BillingSystem
 */
@Repository
public interface BillingRepository extends JpaRepository<BillingDetails, Long> {
}
