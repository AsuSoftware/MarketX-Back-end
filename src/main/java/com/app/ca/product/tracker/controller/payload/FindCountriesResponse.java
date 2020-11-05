package com.app.ca.product.tracker.controller.payload;

import com.app.ca.product.tracker.model.dto.CountryDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** product-tracker Created by Catalin on 10/31/2020 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindCountriesResponse {
  private int page;
  private int size;
  private long total;
  private Iterable<CountryDto> countries;
}
