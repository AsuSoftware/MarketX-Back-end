package com.app.ca.product.tracker.model.dto;

import com.app.ca.product.tracker.model.Country;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/21/2020 */
@Getter
@Setter
public class CountryDto {
  private UUID id;
  private String name;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public static CountryDto mapFromEntity(Country country) {
    CountryDto countryDto = new CountryDto();
    countryDto.setId(country.getId());
    countryDto.setName(country.getName());
    countryDto.setCreatedAt(country.getCreatedAt());
    countryDto.setUpdatedAt(country.getUpdatedAt());
    return countryDto;
  }
}
