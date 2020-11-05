package com.app.ca.product.tracker.service.product;

import com.app.ca.product.tracker.model.dto.UpdateProductDto;

import java.util.UUID;

/** product-tracker Created by Catalin on 10/31/2020 */
public interface ProductUpdater {
  void update(UUID id, UpdateProductDto product);
}
