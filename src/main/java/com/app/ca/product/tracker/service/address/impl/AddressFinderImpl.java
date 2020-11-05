package com.app.ca.product.tracker.service.address.impl;

import com.app.ca.product.tracker.exception.CountryNotFoundException;
import com.app.ca.product.tracker.exception.CountyNotFoundException;
import com.app.ca.product.tracker.model.Country;
import com.app.ca.product.tracker.model.County;
import com.app.ca.product.tracker.repository.CountryRepository;
import com.app.ca.product.tracker.repository.CountyRepository;
import com.app.ca.product.tracker.service.address.AddressFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AddressFinderImpl implements AddressFinder {

  private final CountryRepository countryRepository;
  private final CountyRepository countyRepository;

  @Override
  public Country findCountryById(UUID id) {
    return countryRepository.findById(id).orElseThrow(CountyNotFoundException::new);
  }

  @Override
  public County findCountyById(UUID id) {
    return countyRepository.findById(id).orElseThrow(CountryNotFoundException::new);
  }

  @Override
  public List<Country> findCountriesById(Iterable<UUID> ids) {
    return countryRepository.findAllById(ids);
  }

  @Override
  public List<County> findCountiesById(Iterable<UUID> ids) {
    return countyRepository.findAllById(ids);
  }

  @Override
  public Page<Country> findCountries(PageRequest page) {
    return countryRepository.findAll(page);
  }

  @Override
  public Page<County> findCounties(PageRequest page) {
    return countyRepository.findAll(page);
  }

  @Override
  public long countCountries() {
    return countryRepository.count();
  }

  @Override
  public long countCounties() {
    return countyRepository.count();
  }
}
