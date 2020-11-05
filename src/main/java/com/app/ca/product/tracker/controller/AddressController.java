package com.app.ca.product.tracker.controller;

import com.app.ca.product.tracker.controller.payload.FindCountiesResponse;
import com.app.ca.product.tracker.controller.payload.FindCountriesResponse;
import com.app.ca.product.tracker.model.dto.CountryDto;
import com.app.ca.product.tracker.model.dto.CountyDto;
import com.app.ca.product.tracker.service.address.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** product-tracker Created on 10/21/2020 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/addresses")
public class AddressController {

  private final AddressService addressService;

  @GetMapping(path = "/countries")
  public FindCountriesResponse findCountries(@RequestParam int page, @RequestParam int size) {
    Iterable<CountryDto> countries = addressService.findCountries(page, size);
    long total = addressService.countCountries();
    return FindCountriesResponse.builder()
        .page(page)
        .size(size)
        .total(total)
        .countries(countries)
        .build();
  }

  @GetMapping(path = "/counties")
  public FindCountiesResponse findCounties(@RequestParam int page, @RequestParam int size) {
    Iterable<CountyDto> counties = addressService.findCounties(page, size);
    long total = addressService.countCounties();
    return FindCountiesResponse.builder()
        .page(page)
        .size(size)
        .total(total)
        .counties(counties)
        .build();
  }
}
