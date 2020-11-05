package com.app.ca.product.tracker.controller.payload;

import com.app.ca.product.tracker.model.dto.LoggedUserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/** product-tracker Created by Catalin on 10/30/2020 */
@Getter
@Setter
@AllArgsConstructor
public class LoginUserResponse {
  private LoggedUserDto user;
}
