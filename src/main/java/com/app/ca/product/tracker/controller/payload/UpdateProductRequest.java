package com.app.ca.product.tracker.controller.payload;

import com.app.ca.product.tracker.model.dto.UpdateProductDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/** product-tracker Created by Catalin on 10/31/2020 */
@Getter
@Setter
public class UpdateProductRequest {
  @Valid @NotNull private UpdateProductDto product;
}
