package com.app.ca.product.tracker.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/20/2020 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

  @Id @GeneratedValue private UUID id;

  @NotBlank
  @Column(name = "first_name", nullable = false)
  private String firstName;

  @NotBlank
  @Column(name = "last_name", nullable = false)
  private String lastName;

  @Email
  @NotBlank
  @Column(name = "email", nullable = false)
  private String email;

  @Nullable
  @Column(name = "phone")
  private String phone;

  @Nullable
  @Column(name = "address")
  private String address;

  @NotNull
  @Enumerated(EnumType.STRING)
  @Column(name = "user_type", nullable = false)
  private UserType type;

  @Nullable
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "image_id")
  private Image image;

  @NotNull
  @Column(name = "created_at", nullable = false)
  private LocalDateTime createdAt;

  @NotNull
  @Column(name = "updated_at", nullable = false)
  private LocalDateTime updatedAt;

  @NotNull
  @Column(name = "enabled", nullable = false)
  private Boolean enabled;

  @NotNull
  @ManyToOne
  @JoinColumn(name = "country_id", nullable = false)
  private Country country;

  @NotNull
  @ManyToOne
  @JoinColumn(name = "county_id", nullable = false)
  private County county;
}
