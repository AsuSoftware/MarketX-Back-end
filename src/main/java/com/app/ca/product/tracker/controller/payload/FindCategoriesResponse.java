package com.app.ca.product.tracker.controller.payload;

import com.app.ca.product.tracker.model.dto.CategoryDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/** product-tracker Created on 10/31/2020 */
@Getter
@Setter
@AllArgsConstructor
public class FindCategoriesResponse {
  private List<CategoryDto> categories;
}
