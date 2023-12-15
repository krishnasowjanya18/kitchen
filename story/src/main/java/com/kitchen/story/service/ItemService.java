package com.kitchen.story.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchen.story.dto.ItemDto;
import com.kitchen.story.entity.Item;
import com.kitchen.story.entity.UserClass;
import com.kitchen.story.repository.ItemRepository;
import com.kitchen.story.repository.UserRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private UserRepository userRepository;

	public List<Item> getAllItems(UserClass userClass) {
		Optional<UserClass> adminUser=userRepository.findById(1);
		UserClass admin=adminUser.get();
		if(userClass.getUserName().equalsIgnoreCase("admin") && admin.getPassword().equalsIgnoreCase(userClass.getPassword()))
		{
			return itemRepository.findAll();
		}
		return null;
	}

	public void saveItem(ItemDto itemDto) {
		// TODO Auto-generated method stub
		Optional<UserClass> adminUser=userRepository.findById(1);
		UserClass admin=adminUser.get();
		UserClass user=itemDto.getUserClass();
		if(user.getUserName().equalsIgnoreCase("admin") && admin.getPassword().equalsIgnoreCase(user.getPassword()))
		{
			itemRepository.save(itemDto.getItem());
		}
		
	}

	public void editItem(ItemDto itemDto) {
		// TODO Auto-generated method stub
		Optional<UserClass> adminUser=userRepository.findById(1);
		UserClass admin=adminUser.get();
		UserClass user=itemDto.getUserClass();
		if(user.getUserName().equalsIgnoreCase("admin") && admin.getPassword().equalsIgnoreCase(user.getPassword()))
		{
			Item item=itemDto.getItem();
			itemRepository.edit(item.getItemName(),item.getPrice(),item.getQuantity());
		}
		
	}

	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

}
