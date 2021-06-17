package com.kktrades.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kktrades.domain.Item;

public interface ItemRepository extends CrudRepository<Item, Long>{

	List<Item> findByCategory(String category);

	List<Item> findByTitleContaining(String title);

}
