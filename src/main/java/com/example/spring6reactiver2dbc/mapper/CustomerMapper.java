package com.example.spring6reactiver2dbc.mapper;

import com.example.spring6reactiver2dbc.domain.Beer;
import com.example.spring6reactiver2dbc.domain.Customer;
import com.example.spring6reactiver2dbc.model.BeerDTO;
import com.example.spring6reactiver2dbc.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * @Created 31 03 2023 - 3:02 PM
 * @Author Hazeem Hassan
 */
@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}