package com.app.ca.product.tracker.service.product.impl;

import com.app.ca.product.tracker.model.dto.CountyDto;
import com.app.ca.product.tracker.model.dto.CreateProductDto;
import com.app.ca.product.tracker.model.dto.ProductDto;
import com.app.ca.product.tracker.model.dto.UpdateProductDto;
import com.app.ca.product.tracker.service.product.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductCreator productCreator;
    private final ProductUpdater productUpdater;
    private final ProductFinder productFinder;
    private final ProductRemoval productRemoval;

    @Override
    public void create(CreateProductDto product) {
        productCreator.create(product);
    }

    @Override
    public void update(UUID id, UpdateProductDto product) {
        productUpdater.update(id, product);
    }

    @Override
    public List<ProductDto> findAll(int page, int size) {
        return productFinder.findAll(PageRequest.of(page, size)).stream()
                .map(ProductDto::mapFromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto findById(UUID id) {
        return ProductDto.mapFromEntity(productFinder.findById(id));
    }

    @Override
    public void delete(UUID id) {
     productRemoval.delete(id);
    }

    @Override
    public long count() {
        return productFinder.count();
    }
}
