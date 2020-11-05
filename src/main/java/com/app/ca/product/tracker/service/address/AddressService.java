package com.app.ca.product.tracker.service.address;

import com.app.ca.product.tracker.model.dto.CountryDto;
import com.app.ca.product.tracker.model.dto.CountyDto;

/** product-tracker Created by Catalin on 10/30/2020 */
public interface AddressService {
  Iterable<CountyDto> findCounties(int page, int size);

  Iterable<CountryDto> findCountries(int page, int size);

  long countCountries();

  long countCounties();
}
