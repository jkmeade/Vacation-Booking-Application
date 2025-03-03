package com.example.dao;

import com.example.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "CartItem", path = "CartItem")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}