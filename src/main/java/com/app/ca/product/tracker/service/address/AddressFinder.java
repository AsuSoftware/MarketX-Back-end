package com.app.ca.product.tracker.service.address;

import com.app.ca.product.tracker.model.Country;
import com.app.ca.product.tracker.model.County;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/21/2020 */
public interface AddressFinder {
  Country findCountryById(UUID id);

  County findCountyById(UUID id);

  List<Country> findCountriesById(Iterable<UUID> ids);

  List<County> findCountiesById(Iterable<UUID> ids);

  Page<Country> findCountries(PageRequest page);

  Page<County> findCounties(PageRequest page);

  long countCountries();

  long countCounties();
}
