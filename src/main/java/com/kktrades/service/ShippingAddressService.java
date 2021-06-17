package com.kktrades.service;

import com.kktrades.domain.ShippingAddress;
import com.kktrades.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
