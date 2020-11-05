package com.app.ca.product.tracker.model.dto;

import com.app.ca.product.tracker.model.Subcategory;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/31/2020 */
@Getter
@Setter
public class SubcategoryDto {
  private UUID id;
  private String name;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public static SubcategoryDto mapFromEntity(Subcategory subcategory) {
    SubcategoryDto subcategoryDto = new SubcategoryDto();
    subcategoryDto.setId(subcategory.getId());
    subcategoryDto.setName(subcategory.getName());
    subcategoryDto.setCreatedAt(subcategory.getCreatedAt());
    subcategoryDto.setUpdatedAt(subcategory.getUpdatedAt());
    return subcategoryDto;
  }
}
