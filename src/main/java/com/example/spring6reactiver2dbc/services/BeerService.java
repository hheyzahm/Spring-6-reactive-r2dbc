package com.example.spring6reactiver2dbc.services;

import com.example.spring6reactiver2dbc.model.BeerDTO;
import reactor.core.publisher.Flux;

/**
 * @Created 31 03 2023 - 3:08 PM
 * @Author Hazeem Hassan
 */
public interface BeerService {

    Flux<BeerDTO> listBeer();
}