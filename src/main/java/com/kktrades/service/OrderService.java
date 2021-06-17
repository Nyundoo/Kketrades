package com.kktrades.service;

import com.kktrades.domain.BillingAddress;
import com.kktrades.domain.Order;
import com.kktrades.domain.Payment;
import com.kktrades.domain.ShippingAddress;
import com.kktrades.domain.ShoppingCart;
import com.kktrades.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
