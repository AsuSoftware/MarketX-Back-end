package com.app.ca.product.tracker.model.dto;

import com.app.ca.product.tracker.model.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/31/2020 */
@Getter
@Setter
public class UserDto {
  private UUID id;
  private String firstName;
  private String lastName;
  private String email;
  private String phone;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public static UserDto mapFromEntity(User user) {
    UserDto userDto = new UserDto();
    userDto.setId(user.getId());
    userDto.setFirstName(user.getFirstName());
    userDto.setLastName(user.getLastName());
    userDto.setCreatedAt(user.getCreatedAt());
    userDto.setUpdatedAt(user.getUpdatedAt());
    userDto.setEmail(user.getEmail());
    userDto.setPhone(user.getPhone());
    return userDto;
  }
}
