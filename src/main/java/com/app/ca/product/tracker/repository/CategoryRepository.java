package com.app.ca.product.tracker.repository;

import com.app.ca.product.tracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/** product-tracker Created by Catalin on 10/21/2020 */
public interface CategoryRepository extends JpaRepository<Category, UUID> {}
