package com.example.demo.repository;

import com.example.demo.model.BillingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepo extends JpaRepository<BillingDetails,Integer> {
}
