package com.kktrades.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kktrades.domain.Item;
import com.kktrades.repository.ItemRepository;
import com.kktrades.service.ItemPriceService;

public class ItemPriceServiceImpl implements ItemPriceService {
	@Autowired
	private ItemRepository itemPriceRepository;
	
	public List<Item> findAll() {
		return (List<Item>) itemPriceRepository.findAll();
	}
	
	public Item findOne(Long id) {
		return itemPriceRepository.findById(id).get();
	}

}
