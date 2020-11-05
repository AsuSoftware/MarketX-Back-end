package com.app.ca.product.tracker.model.dto;

import com.app.ca.product.tracker.model.County;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/21/2020 */
@Getter
@Setter
public class CountyDto {
  private UUID id;
  private String name;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private CountryDto country;

  public static CountyDto mapFromEntity(County county) {
    CountyDto countyDto = new CountyDto();
    countyDto.setId(county.getId());
    countyDto.setName(county.getName());
    countyDto.setCountry(CountryDto.mapFromEntity(county.getCountry()));
    countyDto.setCreatedAt(county.getCreatedAt());
    countyDto.setUpdatedAt(county.getUpdatedAt());
    return countyDto;
  }
}
