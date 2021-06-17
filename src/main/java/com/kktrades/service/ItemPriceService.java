package com.kktrades.service;

import java.util.List;

import com.kktrades.domain.Item;

public interface ItemPriceService {
	List<Item> findAll ();
	
	Item findOne(Long id);
}
