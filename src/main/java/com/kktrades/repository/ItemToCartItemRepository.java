package com.kktrades.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.kktrades.domain.CartItem;
import com.kktrades.domain.ItemToCartItem;


@Transactional
public interface ItemToCartItemRepository extends CrudRepository<ItemToCartItem, Long> {
	
	void deleteByCartItem(CartItem cartItem);

}
