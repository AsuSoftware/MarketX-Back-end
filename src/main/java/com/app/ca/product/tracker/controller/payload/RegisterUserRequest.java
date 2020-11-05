package com.app.ca.product.tracker.controller.payload;

import com.app.ca.product.tracker.model.dto.CreateUserDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/** product-tracker Created by Catalin on 10/21/2020 */
@Getter
@Setter
public class RegisterUserRequest {
  @NotNull @Valid private CreateUserDto user;
}
