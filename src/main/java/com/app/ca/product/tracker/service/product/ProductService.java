package com.app.ca.product.tracker.service.product;

import com.app.ca.product.tracker.model.dto.CreateProductDto;
import com.app.ca.product.tracker.model.dto.ProductDto;
import com.app.ca.product.tracker.model.dto.UpdateProductDto;

import java.util.List;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/31/2020 */
public interface ProductService {

  void create(CreateProductDto product);

  void update(UUID id, UpdateProductDto product);

  List<ProductDto> findAll(int page, int size);

  ProductDto findById(UUID id);

  void delete(UUID id);

  long count();
}
