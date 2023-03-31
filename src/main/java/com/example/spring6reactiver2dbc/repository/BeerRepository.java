package com.example.spring6reactiver2dbc.repository;

import com.example.spring6reactiver2dbc.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @Created 31 03 2023 - 2:07 PM
 * @Author Hazeem Hassan
 */
public interface BeerRepository extends ReactiveCrudRepository<Beer,Integer> {
}
