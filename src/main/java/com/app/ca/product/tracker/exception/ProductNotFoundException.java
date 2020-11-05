package com.app.ca.product.tracker.exception;

public class ProductNotFoundException extends ProductTrackerException {
    public ProductNotFoundException() {
        super("Product not found");
    }
}
