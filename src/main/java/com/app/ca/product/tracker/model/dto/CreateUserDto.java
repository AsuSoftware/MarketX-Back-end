package com.app.ca.product.tracker.model.dto;

import com.app.ca.product.tracker.model.UserType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/21/2020 */
@Getter
@Setter
public class CreateUserDto {
  @NotBlank private String firstName;
  @NotBlank private String lastName;
  @Email @NotBlank private String email;
  @NotBlank private String password;
  @Nullable private String phone;
  @Nullable private String address;
  @NotNull private UserType type;
  @NotNull private UUID countyId;
}
