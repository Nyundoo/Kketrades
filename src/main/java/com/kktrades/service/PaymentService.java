package com.kktrades.service;

import com.kktrades.domain.Payment;
import com.kktrades.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
