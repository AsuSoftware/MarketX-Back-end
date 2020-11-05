package com.app.ca.product.tracker.service.category;

import java.util.List;

import com.app.ca.product.tracker.model.dto.CategoryDto;

public interface CategoryService {
  List<CategoryDto> findAll();
}
