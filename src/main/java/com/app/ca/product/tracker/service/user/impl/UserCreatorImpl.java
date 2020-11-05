package com.app.ca.product.tracker.service.user.impl;

import com.app.ca.product.tracker.model.County;
import com.app.ca.product.tracker.model.User;
import com.app.ca.product.tracker.model.dto.CreateUserDto;
import com.app.ca.product.tracker.repository.UserRepository;
import com.app.ca.product.tracker.service.address.impl.AddressFinderImpl;
import com.app.ca.product.tracker.service.user.UserCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@RequiredArgsConstructor
public class UserCreatorImpl implements UserCreator {

  private final UserRepository userRepository;
  private final AddressFinderImpl addressFinder;

  @Override
  @Transactional
  public void create(CreateUserDto createUserDto) {
    County county = addressFinder.findCountyById(createUserDto.getCountyId());
    User user = createUser(createUserDto, county);
    userRepository.save(user);
  }

  private User createUser(CreateUserDto createUserDto, County county) {
    User user = new User();
    user.setFirstName(createUserDto.getFirstName());
    user.setLastName(createUserDto.getLastName());
    user.setEmail(createUserDto.getEmail());
    user.setAddress(createUserDto.getAddress());
    user.setPhone(createUserDto.getPhone());
    user.setType(createUserDto.getType());
    user.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
    user.setUpdatedAt(LocalDateTime.now(ZoneOffset.UTC));
    user.setCounty(county);
    user.setCountry(county.getCountry());
    return user;
  }
}
