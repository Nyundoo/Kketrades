package com.kktrades.service;

import java.util.Set;

import com.kktrades.domain.User;
import com.kktrades.domain.UserBilling;
import com.kktrades.domain.UserPayment;
import com.kktrades.domain.UserShipping;
import com.kktrades.domain.security.PasswordResetToken;
import com.kktrades.domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);

}
