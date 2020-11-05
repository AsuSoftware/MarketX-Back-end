package com.app.ca.product.tracker.repository;

import com.app.ca.product.tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/** product-tracker Created by Catalin on 10/21/2020 */
public interface UserRepository extends JpaRepository<User, UUID> {}
