package com.kktrades.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kktrades.domain.Item;
import com.kktrades.repository.ItemRepository;
import com.kktrades.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> findAll() {
		return (List<Item>) itemRepository.findAll();
	}
	
	public Item findOne(Long id) {
		return itemRepository.findById(id).get();
	}
	
	public List<Item> findByCategory(String category){
		List<Item> itemList = itemRepository.findByCategory(category);
		
		List<Item> activeItemList = new ArrayList<>();
		
		for (Item item: itemList) {
			if(item.isActive()) {
				activeItemList.add(item);
			}
		}
		
		return activeItemList;
	}

	public List<Item> blurrySearch(String title) {
		List<Item> itemList = itemRepository.findByTitleContaining(title);
		List<Item> activeItemList = new ArrayList<>();
		
		for (Item item: itemList) {
			if(item.isActive()) {
				activeItemList.add(item);
			}
		}
		
		return activeItemList;
	}


}
