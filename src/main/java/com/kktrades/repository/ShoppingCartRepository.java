package com.kktrades.repository;

import org.springframework.data.repository.CrudRepository;

import com.kktrades.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
