package com.app.ca.product.tracker.service.product.impl;

import com.app.ca.product.tracker.repository.ProductRepository;
import com.app.ca.product.tracker.service.product.ProductRemoval;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductRemovalImpl implements ProductRemoval {

    private final ProductRepository productRepository;

    @Override
    public void delete(UUID id) {
        productRepository.deleteById(id);
    }
}
