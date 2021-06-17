package com.kktrades.repository;

import org.springframework.data.repository.CrudRepository;

import com.kktrades.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
