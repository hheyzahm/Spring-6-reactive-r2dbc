package com.example.spring6reactiver2dbc.repository;

import com.example.spring6reactiver2dbc.domain.Beer;
import com.example.spring6reactiver2dbc.domain.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @Created 31 03 2023 - 2:07 PM
 * @Author Hazeem Hassan
 */
public interface CustomerRepository extends ReactiveCrudRepository<Customer,Integer> {
}
