package com.kitchen.story.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kitchen.story.entity.Item;

import jakarta.transaction.Transactional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

	@Transactional
	@Modifying
	@Query(value="update Item i set i.price = :price, i.quantity = :quantity\r\n"
			+ "where i.itemName=:itemName")
	public void edit(@Param("itemName")String itemName, @Param("price")int price,@Param("quantity") int quantity);

}
