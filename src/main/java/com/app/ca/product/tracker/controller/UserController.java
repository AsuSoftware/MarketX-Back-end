package com.app.ca.product.tracker.controller;

import com.app.ca.product.tracker.controller.payload.LoginUserRequest;
import com.app.ca.product.tracker.controller.payload.LoginUserResponse;
import com.app.ca.product.tracker.controller.payload.RegisterUserRequest;
import com.app.ca.product.tracker.model.dto.LoggedUserDto;
import com.app.ca.product.tracker.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/** product-tracker Created on 10/21/2020 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/users")
public class UserController {

  private final UserService userService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void register(@Valid @RequestBody RegisterUserRequest request) {
    userService.register(request.getUser());
  }

  @PostMapping(path = "/login")
  public LoginUserResponse login(@Valid @RequestBody LoginUserRequest request) {
    LoggedUserDto user = userService.login(request.getUsername(), request.getPassword());
    return new LoginUserResponse(user);
  }
}
