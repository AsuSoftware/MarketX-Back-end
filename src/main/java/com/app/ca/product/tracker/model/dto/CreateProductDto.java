package com.app.ca.product.tracker.model.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/31/2020 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductDto {
  @NotBlank private String name;
  @NotNull private List<String> images;
  @NotNull private UUID subcategoryId;
}
