package com.kktrades;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kktrades.domain.User;
import com.kktrades.domain.security.Role;
import com.kktrades.domain.security.UserRole;
import com.kktrades.service.UserService;
import com.kktrades.utility.SecurityUtility;

@SpringBootApplication
public class KkeTradesApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(KkeTradesApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("Arthur");
		user1.setLastName("Lukhoni");
		user1.setUsername("a");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("lukhoniarthur@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
	}
}
