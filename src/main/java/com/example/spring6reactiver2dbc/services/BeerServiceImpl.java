package com.example.spring6reactiver2dbc.services;

import com.example.spring6reactiver2dbc.mapper.BeerMapper;
import com.example.spring6reactiver2dbc.model.BeerDTO;
import com.example.spring6reactiver2dbc.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * @Created 31 03 2023 - 3:09 PM
 * @Author Hazeem Hassan
 */
@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {
    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public Flux<BeerDTO> listBeer() {
        return beerRepository.findAll().map(beerMapper::beerToBeerDto);

    }







}
