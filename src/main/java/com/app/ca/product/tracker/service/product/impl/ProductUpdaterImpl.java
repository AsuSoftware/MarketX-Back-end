package com.app.ca.product.tracker.service.product.impl;

import com.app.ca.product.tracker.exception.ProductNotFoundException;
import com.app.ca.product.tracker.model.Image;
import com.app.ca.product.tracker.model.Product;
import com.app.ca.product.tracker.model.Subcategory;
import com.app.ca.product.tracker.model.dto.UpdateProductDto;
import com.app.ca.product.tracker.repository.ProductRepository;
import com.app.ca.product.tracker.service.product.ProductUpdater;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductUpdaterImpl implements ProductUpdater {

    private final ProductRepository productRepository;

    @Override
    public void update(UUID id, UpdateProductDto product) {
        List<Image> images = product.getImages().stream().map(image -> {
            Image img = new Image();
            img.setValue(image);
            img.setEnabled(true);
            img.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
            return img;
        }).collect(Collectors.toList());
        Product productFromRepo = productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
        productFromRepo.setName(product.getName());
        productFromRepo.setImages(images);
        productFromRepo.setUpdatedAt(LocalDateTime.now(ZoneOffset.UTC));
        productRepository.save(productFromRepo);
    }
}
