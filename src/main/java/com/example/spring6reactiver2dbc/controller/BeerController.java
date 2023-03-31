package com.example.spring6reactiver2dbc.controller;

import com.example.spring6reactiver2dbc.model.BeerDTO;
import com.example.spring6reactiver2dbc.services.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @Created 31 03 2023 - 2:46 PM
 * @Author Hazeem Hassan
 */

@RestController
@RequiredArgsConstructor
public class BeerController {
    public static final String BEER_PATH = "/api/v2/beer";
    private final BeerService beerService;
    @GetMapping(BEER_PATH)
    Flux<BeerDTO> listBeers(){
        return beerService.listBeer();

    }
}
























