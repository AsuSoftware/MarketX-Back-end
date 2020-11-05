package com.app.ca.product.tracker.exception;

public class SubcategoryNotFoundException extends ProductTrackerException {
    public SubcategoryNotFoundException() {
        super("Subcategory not found");
    }
}
