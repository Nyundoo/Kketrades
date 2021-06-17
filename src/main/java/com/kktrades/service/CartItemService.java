package com.kktrades.service;


import java.util.List;

import com.kktrades.domain.CartItem;
import com.kktrades.domain.Item;
import com.kktrades.domain.Order;
import com.kktrades.domain.ShoppingCart;
import com.kktrades.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addItemToCartItem(Item item, User user, int qty);

	CartItem findOne(Long cartItemId);

	CartItem findById(Long cartItemId);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);

	List<CartItem> findByOrder(Order order);
}
