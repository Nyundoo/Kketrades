package com.kktrades.service;

import java.util.List;

import com.kktrades.domain.Item;


public interface ItemService {
	List<Item> findAll ();
	
	Item findOne(Long id);

	List<Item> findByCategory(String category);

	List<Item> blurrySearch(String keyword);
}
