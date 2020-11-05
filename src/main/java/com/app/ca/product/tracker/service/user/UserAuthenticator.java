package com.app.ca.product.tracker.service.user;

import com.app.ca.product.tracker.model.dto.LoggedUserDto;

/** product-tracker Created by Catalin on 10/31/2020 */
public interface UserAuthenticator {
  LoggedUserDto login(String username, String password);
}
