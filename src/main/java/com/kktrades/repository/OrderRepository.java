package com.kktrades.repository;

import org.springframework.data.repository.CrudRepository;

import com.kktrades.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
