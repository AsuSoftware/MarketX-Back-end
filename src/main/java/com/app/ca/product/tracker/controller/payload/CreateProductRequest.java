package com.app.ca.product.tracker.controller.payload;

import com.app.ca.product.tracker.model.dto.CreateProductDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/** product-tracker Created on 10/31/2020 */
@Getter
@Setter
public class CreateProductRequest {
  @Valid @NotNull private CreateProductDto product;
}
