package com.app.ca.product.tracker.model.dto;

import com.app.ca.product.tracker.model.Category;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/** product-tracker Created by Catalin on 10/31/2020 */
@Getter
@Setter
public class CategoryDto {
  private UUID id;
  private String name;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private List<SubcategoryDto> subcategories;

  public static CategoryDto mapFromEntity(Category category) {
    CategoryDto categoryDto = new CategoryDto();
    categoryDto.setId(category.getId());
    categoryDto.setName(category.getName());
    categoryDto.setCreatedAt(category.getCreatedAt());
    categoryDto.setUpdatedAt(category.getUpdatedAt());
    categoryDto.setSubcategories(
        category.getSubcategories().stream()
            .map(SubcategoryDto::mapFromEntity)
            .collect(Collectors.toList()));
    return categoryDto;
  }
}
