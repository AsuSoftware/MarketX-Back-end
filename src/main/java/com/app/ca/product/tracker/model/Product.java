package com.app.ca.product.tracker.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/** product-tracker Created by Catalin on 10/20/2020 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

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
  @JoinColumn(name = "user_id", nullable = false)
  private User seller;

  @NotNull
  @ManyToOne
  @JoinColumn(name = "subcategory_id", nullable = false)
  private Subcategory subcategory;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "products_images",
      joinColumns = @JoinColumn(name = "image_id"),
      inverseJoinColumns = @JoinColumn(name = "product_id"))
  private List<Image> images = new ArrayList<>();
}
