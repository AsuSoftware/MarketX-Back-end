package com.app.ca.product.tracker.service.address.impl;

import com.app.ca.product.tracker.model.dto.CountryDto;
import com.app.ca.product.tracker.model.dto.CountyDto;
import com.app.ca.product.tracker.service.address.AddressFinder;
import com.app.ca.product.tracker.service.address.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/** product-tracker Created by Catalin on 10/30/2020 */
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

  private final AddressFinder addressFinder;

  @Override
  public Iterable<CountyDto> findCounties(int page, int size) {
    return addressFinder.findCounties(PageRequest.of(page, size)).stream()
        .map(CountyDto::mapFromEntity)
        .collect(Collectors.toList());
  }

  @Override
  public Iterable<CountryDto> findCountries(int page, int size) {
    return null;
  }

  @Override
  public long countCountries() {
    return addressFinder.countCountries();
  }

  @Override
  public long countCounties() {
    return addressFinder.countCounties();
  }
}
