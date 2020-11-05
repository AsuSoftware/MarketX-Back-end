package com.app.ca.product.tracker.exception;

public class CountyNotFoundException extends ProductTrackerException {
  public CountyNotFoundException() {
    super("Country not found");
  }
}
