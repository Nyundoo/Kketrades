package com.kktrades.service;

import com.kktrades.domain.BillingAddress;
import com.kktrades.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
