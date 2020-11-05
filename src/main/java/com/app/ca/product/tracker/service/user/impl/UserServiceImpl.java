package com.app.ca.product.tracker.service.user.impl;

import com.app.ca.product.tracker.model.dto.CreateUserDto;
import com.app.ca.product.tracker.model.dto.LoggedUserDto;
import com.app.ca.product.tracker.service.user.UserCreator;
import com.app.ca.product.tracker.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserCreator userCreator;

  @Override
  public void register(CreateUserDto createUserDto) {
    userCreator.create(createUserDto);
  }

  @Override
  public LoggedUserDto login(String username, String password) {
    return LoggedUserDto.builder().id(null).username(null).token(null).build();
  }
}
