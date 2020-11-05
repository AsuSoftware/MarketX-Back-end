package com.app.ca.product.tracker.exception;

/** product-tracker Created by Catalin on 10/30/2020 */
public class ProductTrackerException extends RuntimeException {

  public ProductTrackerException(String message) {
    super(message);
  }

  public ProductTrackerException(String message, Throwable cause) {
    super(message, cause);
  }

  public ProductTrackerException(Throwable cause) {
    super(cause);
  }

  public ProductTrackerException(
      String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
