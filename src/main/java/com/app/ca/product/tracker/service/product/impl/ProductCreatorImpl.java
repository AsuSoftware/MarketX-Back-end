package com.app.ca.product.tracker.service.product.impl;

import com.app.ca.product.tracker.model.Image;
import com.app.ca.product.tracker.model.Product;
import com.app.ca.product.tracker.model.Subcategory;
import com.app.ca.product.tracker.model.dto.CountyDto;
import com.app.ca.product.tracker.model.dto.CreateProductDto;
import com.app.ca.product.tracker.repository.ProductRepository;
import com.app.ca.product.tracker.service.category.CategoryFinder;
import com.app.ca.product.tracker.service.product.ProductCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductCreatorImpl implements ProductCreator {

    private final ProductRepository productRepository;
    private final CategoryFinder categoryFinder;


    @Override
    public void create(CreateProductDto product) {
    List<Image> images =
        product.getImages().stream()
            .map(
                image -> {
                  Image img = new Image();
                  img.setValue(image);
                  img.setEnabled(true);
                  img.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
                  return img;
                })
            .collect(Collectors.toList());
    productRepository.save(
        Product.builder()
            .name(product.getName())
            .images(images)
            .subcategory(categoryFinder.findSubcategory(product.getSubcategoryId()))
            .createdAt(LocalDateTime.now(ZoneOffset.UTC))
            .updatedAt(LocalDateTime.now(ZoneOffset.UTC))
            .build());
    }
}
