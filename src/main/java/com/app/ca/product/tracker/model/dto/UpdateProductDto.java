package com.app.ca.product.tracker.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/** product-tracker Created by Catalin on 10/31/2020 */
@Getter
@Setter
public class UpdateProductDto {
  @NotBlank private String name;
  @NotNull private List<String> images;
}
