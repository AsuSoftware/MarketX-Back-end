package com.app.ca.product.tracker.service.category;

import java.util.List;
import java.util.UUID;

import com.app.ca.product.tracker.model.Category;
import com.app.ca.product.tracker.model.Subcategory;

/** product-tracker Created by Catalin on 10/31/2020 */
public interface CategoryFinder {
  List<Category> findAll();
  Subcategory findSubcategory(UUID id);
}
