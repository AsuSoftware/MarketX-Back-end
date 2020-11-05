package com.app.ca.product.tracker.service.product.impl;

import com.app.ca.product.tracker.exception.ProductNotFoundException;
import com.app.ca.product.tracker.model.Product;
import com.app.ca.product.tracker.repository.ProductRepository;
import com.app.ca.product.tracker.service.product.ProductFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductFinderImpl implements ProductFinder {

    private final ProductRepository productRepository;

    @Override
    public Product findById(UUID id) {
        return productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public List<Product> findAll(PageRequest page) {
        return productRepository.findAll(page).stream().collect(Collectors.toList());
    }

    @Override
    public List<Product> findAllById(Iterable<UUID> ids) {
        return productRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return productRepository.count();
    }
}
