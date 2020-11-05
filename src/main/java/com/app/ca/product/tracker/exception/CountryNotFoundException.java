package com.app.ca.product.tracker.exception;

public class CountryNotFoundException extends ProductTrackerException {
  public CountryNotFoundException() {
    super("County not found");
  }
}
