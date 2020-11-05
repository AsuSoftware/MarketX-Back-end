package com.app.ca.product.tracker.service.user;

import com.app.ca.product.tracker.model.dto.CreateUserDto;
import com.app.ca.product.tracker.model.dto.LoggedUserDto;

/** product-tracker Created by Catalin on 10/30/2020 */
public interface UserService {

  void register(CreateUserDto user);

  LoggedUserDto login(String username, String password);
}
