package com.app.ca.product.tracker.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/20/2020 */
@Getter
@Setter
@Entity
@Table(name = "subcategories")
public class Subcategory {

  @Id @GeneratedValue private UUID id;

  @NotBlank
  @Column(name = "name", nullable = false)
  private String name;

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
  @JoinColumn(name = "category_id", nullable = false)
  private Category category;
}
