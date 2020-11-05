package com.app.ca.product.tracker.model.dto;

import com.app.ca.product.tracker.model.Image;
import com.app.ca.product.tracker.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/** product-tracker Created by Catalin on 10/31/2020 */
@Getter
@Setter
public class ProductDto {
  private UUID id;
  private String name;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private UserDto seller;
  private List<String> images;

  public static ProductDto mapFromEntity(Product product) {
    ProductDto productDto = new ProductDto();
    productDto.setId(product.getId());
    productDto.setName(product.getName());
    productDto.setCreatedAt(product.getCreatedAt());
    productDto.setUpdatedAt(product.getUpdatedAt());
    productDto.setSeller(UserDto.mapFromEntity(product.getSeller()));
    productDto.setImages(
        product.getImages().stream().map(Image::getValue).collect(Collectors.toList()));
    return productDto;
  }
}
