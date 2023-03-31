package com.example.spring6reactiver2dbc.controller;

import com.example.spring6reactiver2dbc.model.BeerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @Created 31 03 2023 - 2:46 PM
 * @Author Hazeem Hassan
 */

@RestController
public class BeerController {
    public static final String BEER_PATH = "/api/v2/beer";

    @GetMapping(BEER_PATH)
    Flux<BeerDTO> listBeers(){
        return Flux.just(BeerDTO.builder().id(1).build(),
                BeerDTO.builder().id(2).build(),
                BeerDTO.builder().id(3).build());

    }
}
























