package com.app.ca.product.tracker.controller;

import java.util.List;

import com.app.ca.product.tracker.controller.payload.FindCategoriesResponse;
import com.app.ca.product.tracker.model.dto.CategoryDto;
import com.app.ca.product.tracker.service.category.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** product-tracker Created on 10/21/2020 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/categories")
public class CategoryController {

  private final CategoryService categoryService;

  @GetMapping
  public FindCategoriesResponse find() {
    List<CategoryDto> categories = categoryService.findAll();
    return new FindCategoriesResponse(categories);
  }
}
