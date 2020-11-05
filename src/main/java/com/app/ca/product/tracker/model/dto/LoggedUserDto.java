package com.app.ca.product.tracker.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/** product-tracker Created by Catalin on 10/30/2020 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoggedUserDto {
  private UUID id;
  private String username;
  private String token;
}
