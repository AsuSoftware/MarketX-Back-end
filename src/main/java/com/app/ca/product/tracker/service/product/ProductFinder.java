package com.app.ca.product.tracker.service.product;

import com.app.ca.product.tracker.model.Product;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/31/2020 */
public interface ProductFinder {
  Product findById(UUID id);

  List<Product> findAll(PageRequest page);

  List<Product> findAllById(Iterable<UUID> ids);

  long count();
}
