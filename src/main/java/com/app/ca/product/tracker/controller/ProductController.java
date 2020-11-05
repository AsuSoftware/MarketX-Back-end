package com.app.ca.product.tracker.controller;

import com.app.ca.product.tracker.controller.payload.CreateProductRequest;
import com.app.ca.product.tracker.controller.payload.FindProductsResponse;
import com.app.ca.product.tracker.controller.payload.UpdateProductRequest;
import com.app.ca.product.tracker.model.dto.ProductDto;
import com.app.ca.product.tracker.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

/** product-tracker Created on 10/21/2020 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/products")
public class ProductController {

  private final ProductService productService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void create(@Valid @RequestBody CreateProductRequest request) {
    productService.create(request.getProduct());
  }

  @DeleteMapping(path = "/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable UUID id) {
    productService.delete(id);
  }

  @PutMapping(path = "/{id}")
  public void update(@PathVariable UUID id, @Valid @RequestBody UpdateProductRequest request) {
    productService.update(id, request.getProduct());
  }

  @GetMapping(path = "/{id}")
  public FindProductsResponse find(@PathVariable UUID id) {
    ProductDto productDto = productService.findById(id);
    return FindProductsResponse.builder()
        .page(0)
        .size(1)
        .total(1)
        .products(List.of(productDto))
        .build();
  }

  @GetMapping
  public FindProductsResponse find(@RequestParam int page, @RequestParam int size) {
    long total = productService.count();
    List<ProductDto> productDtoList = productService.findAll(page, size);
    return FindProductsResponse.builder()
        .page(page)
        .size(size)
        .total(total)
        .products(productDtoList)
        .build();
  }
}
