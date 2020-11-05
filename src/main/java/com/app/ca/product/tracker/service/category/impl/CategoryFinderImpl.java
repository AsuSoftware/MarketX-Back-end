package com.app.ca.product.tracker.service.category.impl;

import com.app.ca.product.tracker.exception.SubcategoryNotFoundException;
import com.app.ca.product.tracker.model.Category;
import com.app.ca.product.tracker.model.Subcategory;
import com.app.ca.product.tracker.repository.CategoryRepository;
import com.app.ca.product.tracker.repository.SubcategoryRepository;
import com.app.ca.product.tracker.service.category.CategoryFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryFinderImpl implements CategoryFinder {

    private CategoryRepository categoryRepository;
    private SubcategoryRepository subcategoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Subcategory findSubcategory(UUID id) {
        return subcategoryRepository.findById(id).orElseThrow(SubcategoryNotFoundException::new);
    }

}
