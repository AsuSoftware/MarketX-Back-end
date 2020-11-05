package com.app.ca.product.tracker.controller.payload;

import lombok.Getter;
import lombok.Setter;

/** product-tracker Created by Catalin on 10/30/2020 */
@Getter
@Setter
public class LoginUserRequest {
  private String username;
  private String password;
}
